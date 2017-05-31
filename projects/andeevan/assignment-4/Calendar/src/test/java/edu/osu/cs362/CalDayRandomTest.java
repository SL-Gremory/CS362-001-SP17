package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 System.out.println("Start testing, this will take 30 seconds...");
		 
		 GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		 CalDay calday = new CalDay(cal);
		 
		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				//long randomseed =10;//System.currentTimeMillis();
				long randomseed =System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=12;
				 int startMinute=30;
				 int startDay=10;
				 int startMonth=10;
				 int startYear=2017;
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
						  startMinute ,
						  startDay ,
						  startMonth ,
						  startYear ,
						  title,
						 description);
				
					appt.setStartHour(random.nextInt(24));
					//appt.setStartHour(10);
					appt.setStartMinute(random.nextInt(60));
					//appt.setStartMinute(10);
					appt.setStartDay(random.nextInt(35));
					//appt.setStartDay(10);
					appt.setStartMonth(random.nextInt(12));
					//appt.setStartMonth(10);
					
					calday.addAppt(appt);
				
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = CalDayRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("addAppt")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   calday.addAppt(appt);						   
						}
				}
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			       if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		 }
		 System.out.println("Done testing...");
	 }
}
