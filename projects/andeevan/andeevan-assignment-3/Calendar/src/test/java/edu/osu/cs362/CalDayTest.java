package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, 10, -1);
		CalDay calday = new CalDay(cal);
		
		assertNotEquals(-1, calday.getDay()); //test out of range day value
	 }

	 @Test
	  public void test02()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, -1, 10);
		CalDay calday = new CalDay(cal);
		
		assertNotEquals(-1, calday.getMonth()); //test out of range month value
	 }

	 @Test
	  public void test03()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(-1, 10, 10);
		CalDay calday = new CalDay(cal);
		
		assertNotEquals(-1, calday.getYear()); //test out of range year value
	 }

	@Test
	  public void test04_1()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar();
		CalDay calday = new CalDay(cal);
		
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
		
		calday.addAppt(appt);
		String return_string = calday.toString();

		assertNotEquals("2017/10/10", calday.toString()); //test out of range year value
		
		assertEquals(1, calday.getSizeAppts());
		assertNotNull(return_string);
	 }

	@Test
	  public void test04()  throws Throwable  {

		CalDay calday = new CalDay();
	
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(0,
		          0 ,
		          0 ,
		          0 ,
		          0 ,
		          null,
		          null);
		
		calday.addAppt(appt);

	
		String return_string = calday.toString();

		assertNotEquals("2017/10/10", calday.toString()); //test out of range year value
		assertNotNull(return_string);
	 }

	@Test
	  public void test05()  throws Throwable  {

		//GregorianCalendar cal = new GregorianCalendar(-1, 10, 10);
		CalDay calday = new CalDay();
		
		

		assertNull(calday.iterator());

	}

	@Test
	  public void test06()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		CalDay calday = new CalDay(cal);
		
		assertNotNull(calday.iterator());
	
	}

	@Test
	  public void test07()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		CalDay calday = new CalDay(cal);
		
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
		
		calday.addAppt(appt);
		
		startHour=11;
		startMinute=30;
		startDay=10;
		startMonth=10;
		startYear=2017;
		title="Birthday Party 2";
		description="This is my birthday party 2.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		calday.addAppt(appt2);

	 }

//NEW TESTS AS OF ASSIGNMENT 3

	@Test
	  public void test08()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		CalDay calday = new CalDay(cal);

		//testing to see if NULL day/month/year values survive
		assertEquals(10, calday.getDay());
		assertEquals(10,calday.getMonth());
		assertEquals(2017,calday.getYear());
	 }

	@Test
	  public void test09()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		CalDay calday = new CalDay(cal);

		String return_string = calday.toString();

		assertNotNull(calday.toString());
	}
	 
	@Test
	  public void test10()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		CalDay calday = new CalDay(cal);
		
		 int startHour=11;
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
		
		startHour=11;
		startMinute=30;
		startDay=10;
		startMonth=10;
		startYear=2017;
		title="Birthday Party 2";
		description="This is my birthday party 2.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		calday.addAppt(appt);
		int startHourTest1 = appt.getStartHour();
		calday.addAppt(appt2);
		int startHourTest2 = appt2.getStartHour();
		
		assertEquals(calday.appts.get(0), appt);
		assertEquals(calday.appts.get(1), appt2);
	 }	 

	@Test
	  public void test11()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar(2017, 10, 10);
		CalDay calday = new CalDay(cal);
		
		 int startHour=9;
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
		
		startHour=11;
		startMinute=30;
		startDay=10;
		startMonth=10;
		startYear=2017;
		title="Birthday Party 2";
		description="This is my birthday party 2.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		calday.addAppt(appt2);
		int startHourTest1 = appt.getStartHour();
		calday.addAppt(appt);
		int startHourTest2 = appt2.getStartHour();
		
		assertEquals(calday.appts.get(0), appt);
		assertEquals(calday.appts.get(1), appt2);
		assertEquals(2, calday.appts.size());
	 }
	 
}
