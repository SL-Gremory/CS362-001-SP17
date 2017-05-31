package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
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
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 System.out.println("Start testing, this will take 30 seconds...");
		 
		 GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		 CalDay calday = new CalDay(cal);
		 TimeTable tt1 = new TimeTable();
		 int j = 0;
		 
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
					appt.setStartMinute(random.nextInt(60));
					appt.setStartDay(random.nextInt(35));
					appt.setStartMonth(random.nextInt(12));
					
					calday.addAppt(appt);
				
				j = random.nextInt(5);
				if (j==0){
					tt1.deleteAppt(null, appt);
				}
				else if (j==1){
					tt1.deleteAppt(calday.appts, null);
				}
				else if (j==2){
					tt1.deleteAppt(null, null);
				}
				else if (j==3){
					tt1.deleteAppt(calday.appts, appt);
				}
				else if (j==4){
					tt1.deleteAppt(calday.appts, appt);
					tt1.deleteAppt(calday.appts, appt);
				}
				
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			       if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		 }
		 System.out.println("Done testing...");
	 }
}
