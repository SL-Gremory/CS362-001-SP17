/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import java.util.Random;
import java.util.concurrent.TimeUnit.*;



/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.


/**
* From ResultPair.java
*/
   
   public class ResultPair {
	public String item;
	public boolean valid;

	public ResultPair(String item, boolean valid) {
		this.item = item;
		this.valid = valid;
	}
   }

	
/**
 * From Part A
 */


   // SCHEMES: VALID from 0 to 3. INVALID from 4 to 7	
   ResultPair[] schemeList = {new ResultPair("http://", true),
			   new ResultPair("ftp://", true),
			   new ResultPair("h3t://", true),
			   new ResultPair("", true),
			   new ResultPair("3ht://", false),
			   new ResultPair("http:/", false),
			   new ResultPair("http:/", false),
			   new ResultPair("://", false)
			  };

   // AUTHORITY: VALID from 0 to 6. INVALID from 7 to 16
   ResultPair[] authorityList = {new ResultPair("www.google.com", true),
			     new ResultPair("go.com", true),
			     new ResultPair("go.au", true),
			     new ResultPair("0.0.0.0", true),
			     new ResultPair("255.255.255.255", true),
			     new ResultPair("255.com", true),
			     new ResultPair("go.cc", true),
			     new ResultPair("1.2.3.4.5", false),
			     new ResultPair("1.2.3.4.", false),
			     new ResultPair("go.a", false),
			     new ResultPair("go.a1a", false),
			     new ResultPair("go.1aa", false),
			     new ResultPair("aaa.", false),
			     new ResultPair(".aaa", false),
			     new ResultPair("aaa", false),
			     new ResultPair("256.256.256.256", false),
			     new ResultPair("", false)
			    };

   // PORTS: VALID from 0 to 4. INVALID from 5 to 6
   ResultPair[] portList = {new ResultPair(":80", true),
			new ResultPair(":65535", true),
			new ResultPair(":0", true),
			new ResultPair("", true),
			new ResultPair(":65636", true),
			new ResultPair(":-1", false),
			new ResultPair(":65a", false)
		       };

   // PATHS: VALID from 0 to 5. INVALID from 6 to 9
   ResultPair[] pathList = {new ResultPair("/test1", true),
			new ResultPair("/t123", true),
			new ResultPair("/$23", true),
			new ResultPair("/test1", true),
			new ResultPair("", true),
			new ResultPair("/test1/file", true),
			new ResultPair("/..", false),
			new ResultPair("/../", false),
			new ResultPair("/..//file", false),
			new ResultPair("/test1//file", false)
		       };

   // PATH OPTIONS: VALID from 0 to 8. INVALID from 9 to 14
   ResultPair[] pathOptionList = {new ResultPair("/test1", true),
			      new ResultPair("/t123", true),
			      new ResultPair("/$23", true),
			      new ResultPair("/test1/", true),
			      new ResultPair("", true),
			      new ResultPair("/test1/file", true),
			      new ResultPair("/t123/file", true),
			      new ResultPair("/$23/file", true),
			      new ResultPair("/test1//file", true),
			      new ResultPair("/..", false),
			      new ResultPair("/../", false),
			      new ResultPair("/#", false),
			      new ResultPair("/../file", false),
			      new ResultPair("/..//file", false),
			      new ResultPair("/#/file", false)
			     };

   // QUERIES: VALID from 0 to 3
   ResultPair[] queryList = {new ResultPair("?action=view", true),
			 new ResultPair("?action=edit&mode=up", true),
			 new ResultPair("", true)
			};



   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   // Part One  
   public void testManualTest()
   {

	
	   System.out.println("\nSTARTING MANUAL TEST ON RANDOM URLS\n");	
	   

	   UrlValidator urlVal = new UrlValidator(null, 
						  null, 
						  UrlValidator.ALLOW_ALL_SCHEMES);

	   // Input valid URLs	

	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("www.amazon.com"));
	   System.out.println(urlVal.isValid("HTTP://WWW.AMAZON.COM"));
	   System.out.println(urlVal.isValid("http://www.amazon.com/"));
	   System.out.println(urlVal.isValid("http://www.reddit.com"));
	   System.out.println(urlVal.isValid("http://www.reddit.com/r/ProgrammerHumor"));
	   System.out.println(urlVal.isValid("https://www.reddit.com/r/ProgrammerHumor"));
	   System.out.println(urlVal.isValid("http://www.imgur.com"));
	   System.out.println(urlVal.isValid("http://gamefaqs.com"));
	   System.out.println(urlVal.isValid("http://www.brave-exvius.com"));
	   System.out.println(urlVal.isValid("http://google.com"));
	   System.out.println(urlVal.isValid("http://thisisnotgoogle.com"));
	   System.out.println(urlVal.isValid("http://google"));
	   System.out.println(urlVal.isValid("http://google.com/test"));
	   System.out.println(urlVal.isValid("http:///google.com/"));
	   System.out.println(urlVal.isValid("http://osu.ppy.sh"));
	   System.out.println(urlVal.isValid("http://web.engr.oregonstate.edu/cgi-bin/cgiwrap/dmcgrath/classes/17S/cs444/index.cgi?home=1"));
   
	
	   System.out.println("\nDONE MANUALLY TESTING URLS RANDOMLY\n");	

	} 
   // Part Two, Partition 1: Testing Prefix (http, https, etc)
   public void testPrefix()
   {

	   System.out.println("\nSTARTING MANUAL TEST ON URL PREFIXES\n");	

	   UrlValidator urlVal = new UrlValidator(null, 
						  null, 
						  UrlValidator.ALLOW_ALL_SCHEMES);


	   //Valid URLs
	   System.out.println(urlVal.isValid("http://www.amazon.com")); //known working URL using "http" prefix
	   System.out.println(urlVal.isValid("https://www.amazon.com")); //known working URL using "https" prefix
	   //Invalid URLs
	   System.out.println(urlVal.isValid("httpsa://www.amazon.com")); //extended string that would otherwise be valid
	   System.out.println(urlVal.isValid("httpa://www.amazon.com")); //extended string that would otherwise be valid
	   System.out.println(urlVal.isValid("amazon.com")); //no prefix
	   System.out.println(urlVal.isValid("www.amazon.com")); //partial prefix 1
	   System.out.println(urlVal.isValid("https://amazon.com")); //partial prefix 2
	   System.out.println(urlVal.isValid("http://amazon.com")); //partial prefix 3
	   System.out.println(urlVal.isValid("https://www.")); //only prefix
	   System.out.println(urlVal.isValid("HTTPS://WWW.amazon.com")); //capital prefix
	   System.out.println(urlVal.isValid("https:www.amazon.com")); //removed forward slashes
	   System.out.println(urlVal.isValid("https//www.amazon.com")); //removed colon
	   System.out.println(urlVal.isValid("https://wwwamazon.com")); //removed period separator between prefix and main body
 
	
	   System.out.println("\nDONE MANUALLY TESTING URL PREFIXES\n");	
  }
   
   // Part Two, Partition 2: Testing Domain (everything between prefix and suffix)
   public void testMainBody()
   {

	   System.out.println("\nSTARTING MANUAL TEST ON URL BODY\n");	
	   
	   UrlValidator urlVal = new UrlValidator(null, 
						  null, 
						  UrlValidator.ALLOW_ALL_SCHEMES);


	   //Valid URLs
	   System.out.println(urlVal.isValid("http://www.amazon.com")); //known working URL using "http" prefix
	   System.out.println(urlVal.isValid("https://www.amazon.com")); //known working URL using "https" prefix
	   //Invalid URLs
	   System.out.println(urlVal.isValid("https://www..com")); //missing body
	   System.out.println(urlVal.isValid("https://www.com")); //missing body and separator
	   System.out.println(urlVal.isValid("https://www.123456789009876543321.com")); //valid body ???
	   System.out.println(urlVal.isValid("https://www.AMAZON.com")); //capitalized body
	   System.out.println(urlVal.isValid("https://www.amazon.amazon.com")); //repeated body
	   System.out.println(urlVal.isValid("https://www./@#$%^.com")); //invalid body


	   System.out.println("\nDONE MANUALLY TESTING URL BODY\n");	

   }
   
   // Part Two, Partition 3: Testing URL Suffixes (everything after .com, .org, .net, .edu, etc)
   public void testSuffix()
   {


   	   System.out.println("\nSTARTING MANUAL TEST ON URL SUFFIXES\n");	

	   UrlValidator urlVal = new UrlValidator(null, 
						  null, 
						  UrlValidator.ALLOW_ALL_SCHEMES);


	   //Valid URLs
	   System.out.println(urlVal.isValid("http://www.amazon.com")); //known working URL using "http" prefix
	   System.out.println(urlVal.isValid("https://www.amazon.com")); //known working URL using "https" prefix
	   //Invalid URLs
	   System.out.println(urlVal.isValid("https://www.amazon")); //missing suffix
	   System.out.println(urlVal.isValid("https://www.amazon.coma")); //extended suffix that would otherwise be valid
	   System.out.println(urlVal.isValid("https://www.amazoncom")); //missing separateor between main body and suffix
	   System.out.println(urlVal.isValid("https://www.amazon.ru")); //using private domain suffix
	   System.out.println(urlVal.isValid("https://www.amazon.co m")); //invalid space separator in suffix
	   System.out.println(urlVal.isValid("https://www.amazon.com/gp/product/B06W2N33M1/ref=s9u_simh_gw_i2")); //extended suffix (should be valid)
	   System.out.println(urlVal.isValid("https://www.amazon.com/gp/product/B06W2N33M1/ref=s9u_simh_gw_i2!@#$%^&*")); //invalid extended suffix


   	   System.out.println("\nDONE MANUALLY TESTING URL SUFFIXES\n");	

   }


   private int randomizedChoice(int listSize)
   {
	long randomseed = System.currentTimeMillis();
//	long randomseed = 5;
	Random random = new Random(randomseed);
	int randVal = random.nextInt(listSize);
		
	return randVal;
   }

   private int randomizedChoiceWithRange(int min, int max)
   {
	long randomseed = System.currentTimeMillis();
	Random random = new Random(randomseed);
	int randVal = random.nextInt(max) + min;

	return randVal;
   }

   // THIS WILL USE RANDOM TESTING
   public void testIsValid()
   {

	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARTING RANDOM TEST WITH BOTH VALID AND INVALID URLS\n");	


//	for(int i = 0;i<10000;i++)
	for(int i = 0;i < 50; i++)
	{
		Boolean validParts = true;
	//	long randomseed = System.currentTimeMillis();
	//	Random random = new Random(randomseed);
		ResultPair randScheme =  schemeList[randomizedChoice(schemeList.length)];
		ResultPair randAuthority =  authorityList[randomizedChoice(authorityList.length)];
		ResultPair randPort =  portList[randomizedChoice(portList.length)];
		ResultPair randPath =  pathList[randomizedChoice(pathList.length)];
		ResultPair randPathOptions = pathOptionList[randomizedChoice(pathOptionList.length)];
		ResultPair randQuery = queryList[randomizedChoice(queryList.length)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;

		if(validParts != valObject.isValid(fullTestUrl)) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}


	System.out.println("\nTEST WITH BOTH VALID AND INVALID URLS DONE\n");	

   }
   

   public void testIsValidWithOnlyValidUrls()
   {
	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARTING RANDOM TEST WITH ONLY VALID URLS\n");	

	for(int i = 0;i < 30; i++)
	{
		Boolean validParts = true;
		ResultPair randScheme =  schemeList[randomizedChoiceWithRange(0,3)];
		ResultPair randAuthority =  authorityList[randomizedChoiceWithRange(0,6)];
		ResultPair randPort =  portList[randomizedChoiceWithRange(0,4)];
		ResultPair randPath =  pathList[randomizedChoiceWithRange(0,5)];
		ResultPair randPathOptions = pathOptionList[randomizedChoiceWithRange(0,8)];
		ResultPair randQuery = queryList[randomizedChoiceWithRange(0,3)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;
		
		if(valObject.isValid(fullTestUrl) != true) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	System.out.println("\nTEST WITH ONLY VALID URLS DONE\n");	

   }


   public void testIsValidWithOnlyInvalidUrls()
   {
	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARTING RANDOM TEST WITH ONLY INVALID URLS\n");	

	for(int i = 0;i < 1000; i++)
	{
		Boolean validParts = true;
		ResultPair randScheme =  schemeList[randomizedChoiceWithRange(4,4)];
		ResultPair randAuthority =  authorityList[randomizedChoiceWithRange(7,10)];
		ResultPair randPort =  portList[randomizedChoiceWithRange(5,2)];
		ResultPair randPath =  pathList[randomizedChoiceWithRange(6,4)];
		ResultPair randPathOptions = pathOptionList[randomizedChoiceWithRange(9,6)];
		ResultPair randQuery = queryList[randomizedChoiceWithRange(0,3)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;

		if(valObject.isValid(fullTestUrl) != false) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	System.out.println("\nTEST WITH ONLY INVALID URLS DONE\n");	

   }


   public void testIsValidWithInvalidScheme()
   {
	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARTING RANDOM TEST WITH INVALID SCHEME\n");	

	for(int i = 0;i < 25; i++)
	{
		Boolean validParts = true;
		ResultPair randScheme =  schemeList[randomizedChoiceWithRange(4,4)];
		ResultPair randAuthority =  authorityList[randomizedChoiceWithRange(0,6)];
		ResultPair randPort =  portList[randomizedChoiceWithRange(0,4)];
		ResultPair randPath =  pathList[randomizedChoiceWithRange(0,5)];
		ResultPair randPathOptions = pathOptionList[randomizedChoiceWithRange(0,8)];
		ResultPair randQuery = queryList[randomizedChoiceWithRange(0,3)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;
		
		if(valObject.isValid(fullTestUrl) != false) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	System.out.println("\nTEST WITH ONLY INVALID SCHEMES DONE\n");	

   }


   public void testIsValidWithInvalidAuthority()
   {
	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARTING RANDOM TEST WITH INVALID AUTHORITY\n");	

	for(int i = 0;i < 25; i++)
	{
		Boolean validParts = true;
		ResultPair randScheme =  schemeList[randomizedChoiceWithRange(0,3)];
		ResultPair randAuthority =  authorityList[randomizedChoiceWithRange(7,10)];
		ResultPair randPort =  portList[randomizedChoiceWithRange(0,4)];
		ResultPair randPath =  pathList[randomizedChoiceWithRange(0,5)];
		ResultPair randPathOptions = pathOptionList[randomizedChoiceWithRange(0,8)];
		ResultPair randQuery = queryList[randomizedChoiceWithRange(0,3)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;
		
		if(valObject.isValid(fullTestUrl) != false) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	System.out.println("\nTEST WITH ONLY INVALID AUTHORITY DONE\n");	

   }



   public void testIsValidWithInvalidPort()
   {
	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARTING RANDOM TEST WITH INVALID PORT\n");	

	for(int i = 0;i < 25; i++)
	{
		Boolean validParts = true;
		ResultPair randScheme =  schemeList[randomizedChoiceWithRange(0,3)];
		ResultPair randAuthority =  authorityList[randomizedChoiceWithRange(0,6)];
		ResultPair randPort =  portList[randomizedChoiceWithRange(5,2)];
		ResultPair randPath =  pathList[randomizedChoiceWithRange(0,5)];
		ResultPair randPathOptions = pathOptionList[randomizedChoiceWithRange(0,8)];
		ResultPair randQuery = queryList[randomizedChoiceWithRange(0,3)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;
		
		if(valObject.isValid(fullTestUrl) != false) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	System.out.println("\nTEST WITH ONLY INVALID PORT DONE\n");	

   }



   public void testIsValidWithInvalidPath()
   {
	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARING RANDOM TEST WITH INVALID PATH\n");	

	for(int i = 0;i < 25; i++)
	{
		Boolean validParts = true;
		ResultPair randScheme =  schemeList[randomizedChoiceWithRange(0,3)];
		ResultPair randAuthority =  authorityList[randomizedChoiceWithRange(0,6)];
		ResultPair randPort =  portList[randomizedChoiceWithRange(0,4)];
		ResultPair randPath =  pathList[randomizedChoiceWithRange(6,4)];
		ResultPair randPathOptions = pathOptionList[randomizedChoiceWithRange(0,8)];
		ResultPair randQuery = queryList[randomizedChoiceWithRange(0,3)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;
		
		if(valObject.isValid(fullTestUrl) != false) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	System.out.println("\nTEST WITH ONLY INVALID PATH DONE\n");	

   }


   public void testIsValidWithInvalidPathOptions()
   {
	UrlValidator valObject = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\nSTARTING RANDOM TEST WITH INVALID PATH OPTIONS\n");	

	for(int i = 0;i < 25; i++)
	{
		Boolean validParts = true;
		ResultPair randScheme =  schemeList[randomizedChoiceWithRange(0,3)];
		ResultPair randAuthority =  authorityList[randomizedChoiceWithRange(0,6)];
		ResultPair randPort =  portList[randomizedChoiceWithRange(0,4)];
		ResultPair randPath =  pathList[randomizedChoiceWithRange(0,5)];
		ResultPair randPathOptions = pathOptionList[randomizedChoiceWithRange(9,6)];
		ResultPair randQuery = queryList[randomizedChoiceWithRange(0,3)];
		
		if(randScheme.valid == false) validParts = false;
		if(randAuthority.valid == false) validParts = false;
		if(randPort.valid == false) validParts = false;
		if(randPath.valid == false) validParts = false;
		if(randPathOptions.valid == false) validParts = false;
		if(randQuery.valid == false) validParts = false;
		
		String fullTestUrl = randScheme.item + randAuthority.item + randPort.item + randPathOptions.item + randQuery.item;
		
		if(valObject.isValid(fullTestUrl) != false) {
			System.out.println("\tTest #" + i + " should return " + validParts.toString() + ". It actually returned " + valObject.isValid(fullTestUrl));
			System.out.println("\t\t" + fullTestUrl);
		}
		// This part is important!
		try {
			Thread.sleep(1);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	System.out.println("\nTEST WITH ONLY INVALID PATH OPTIONS DONE\n");	

   }























   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
