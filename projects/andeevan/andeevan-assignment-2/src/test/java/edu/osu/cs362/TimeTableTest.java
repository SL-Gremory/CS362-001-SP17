package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object
		int startHour=10;
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
		//end new appointment object
		
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 30);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 1);
		CalDay calday = new CalDay(date1);
		//end new calendar object

		calday.addAppt(appt);
		tt1.getApptRange(calday.appts, date1, date2);

	 }

	@Test
	  public void test02()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object
		int startHour=10;
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
		//end new appointment object
		
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 1);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 30);
		CalDay calday = new CalDay(date1);
		//end new calendar object

		calday.addAppt(appt);
		tt1.deleteAppt(calday.appts, appt); //testing deleteAppt for valid appointment

	 }

	@Test
	  public void test03()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object
		int startHour=10;
		int startMinute=-1;
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
		//end new appointment object
		
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 1);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 30);
		CalDay calday = new CalDay(date1);
		//end new calendar object

		calday.addAppt(appt);
		tt1.deleteAppt(calday.appts, appt); //testing deleteAppt for invalid appointment

	 }

	@Test
	  public void test04()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object
		int startHour=-1;
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
		//end new appointment object
		
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 1);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 30);
		CalDay calday = new CalDay(date1);
		//end new calendar object

		tt1.deleteAppt(calday.appts, appt); //testing deleteAppt for no appointments

	 }

	@Test
	  public void test05()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object
		int startHour=10;
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
		//end new appointment object
		
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 1);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 30);
		CalDay calday = new CalDay(date1);
		//end new calendar object

		calday.addAppt(appt);
		tt1.deleteAppt(calday.appts, null); //testing deleteAppt for null appointment

	 }

	@Test
	  public void test06()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object 1
		int startHour=10;
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
		//end new appointment object 1
	
		//new appointment object 2
		int startHour2=10;
		int startMinute2=30;
		int startDay2=10;
		int startMonth2=10;
		int startYear2=2017;
		String title2="Birthday Party";
		String description2="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2);
		//end new appointment object 2

	
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 1);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 30);
		CalDay calday = new CalDay(date1);
		//end new calendar object

		calday.addAppt(appt);
		calday.addAppt(appt2);
		tt1.deleteAppt(calday.appts, appt2); //testing deleting multiple instances of same appointment

	 }

	@Test
	  public void test07()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object
		int startHour=10;
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
		//end new appointment object
		
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 1);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 30);
		CalDay calday = new CalDay(date1);
		//end new calendar object

		calday.addAppt(appt);
		tt1.deleteAppt(null, null); //testing deleteAppt for null appointments in both parameters

	 }

	@Test
	  public void test08()  throws Throwable  {
		
		TimeTable tt1 = new TimeTable();
 
		//new appointment object
		int startHour=10;
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
		//end new appointment object
		
		//new calendar object (year, month, day)
		GregorianCalendar date1 = new GregorianCalendar(2017, 10, 1);
		GregorianCalendar date2 = new GregorianCalendar(2017, 10, 30);
		GregorianCalendar middate = new GregorianCalendar(2017, 10, 15);
		CalDay calday = new CalDay(middate);
		//end new calendar object

		calday.addAppt(appt);
		tt1.getApptRange(calday.appts, date1, date2);

	 }

}
