package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
		public void test02() throws Throwable	{
		int startHour=40; //test hour outside of acceptable bounds
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(40, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
	
	@Test
		public void test03() throws Throwable	{
		int startHour=13;
		 int startMinute=61; //test minute outside of acceptable bounds
		 int startDay=10;
		 int startMonth=4;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(61, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
		public void test04() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=32; // test day outside of acceptable bounds
		 int startMonth=4;
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
		public void test05() throws Throwable	{	
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=13; //test month outside of acceptable bounds
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
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
		public void test06() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=-1; // test negative year value
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(-1, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
		public void test07() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title=""; //test empty string
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
		public void test08() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description=""; //test empty string
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }

	@Test
		public void test09() throws Throwable	{
		int startHour=-1;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party."; //test empty string
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt.setStartHour(-1); //test bad hour value
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(-1, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertNotEquals("", appt.getDescription());         		
	 }

	@Test
		public void test10() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party."; //test empty string
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt.setStartMinute(61); //test bad minute value
	// assertions
		 assertFalse(appt.getValid());
		 assertNotEquals(14, appt.getStartHour());
		 assertEquals(61, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertNotEquals("", appt.getDescription());         		
	 }

	@Test
		public void test11() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party."; //test empty string
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt.setStartDay(32); //test bad day value
	// assertions
		 assertFalse(appt.getValid());
		 assertNotEquals(14, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertNotEquals("", appt.getDescription());         		
	 }

	@Test
		public void test12() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party."; //test empty string
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt.setStartYear(-1); //test bad year value
	// assertions
		 assertTrue(appt.getValid());
		 assertNotEquals(14, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(-1, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertNotEquals("", appt.getDescription());         		
	 }

	@Test
		public void test13() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party."; //test empty string
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt.setTitle(null); //test null title string
	// assertions
		 assertTrue(appt.getValid());
		 assertNotEquals(14, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertNotEquals(null, appt.getTitle());
		 assertNotEquals("", appt.getDescription());         		
	 }

	@Test
		public void test14() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
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
		
		appt.setDescription(null); //test null description string
	// assertions
		 assertTrue(appt.getValid());
		 assertNotEquals(14, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertNotEquals(null, appt.getDescription());         		
	 }

	@Test
		public void test15() throws Throwable	{
		int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
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
		
		appt.setStartMonth(13);
	// assertions
		 assertFalse(appt.getValid());
		 assertNotEquals(14, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertNotEquals("", appt.getDescription());         		
	 }

	@Test
		public void test16() throws Throwable	{
		int startHour=13;
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
	// assertions
		 assertTrue(appt.getValid());
		 appt.toString();
	 }

	@Test
		public void test17() throws Throwable	{
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
	// assertions
		 assertFalse(appt.getValid());
		 appt.toString();
	 }
	 
//NEW TESTS AS OF ASSIGNMENT 3

	@Test
		public void test18() throws Throwable	{
		int startHour=50;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=-1;
		 String title="Birthday Party";
		 String description="This is my birthday party."; //test empty string
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
		appt.setStartHour(50); //test bad hour value
		appt.setStartYear(-1); //test bad year value
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(50, appt.getStartHour());
		 assertEquals(-1, appt.getStartYear());        		
	 }
	 
	@Test
		public void test19() throws Throwable	{
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
		String testString = appt.toString();
	// assertions
	// testing with hour < 12, still valid
		 assertTrue(appt.getValid());
		 assertEquals("\t"+ appt.getStartMonth()+"/"+appt.getStartDay()+"/"+appt.getStartYear() + " at " +   10 +":"+ appt.getStartMinute() + "am" + " ," +  appt.getTitle()+ ", "+  appt.getDescription()+"\n", testString);
	 }
	 
	@Test
		public void test20() throws Throwable	{
		int startHour=14;
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
		String testString = appt.toString();
	// assertions
	// testing with hour > 12, still valid
		 assertTrue(appt.getValid());
		 assertEquals("\t"+ appt.getStartMonth()+"/"+appt.getStartDay()+"/"+appt.getStartYear() + " at " +   2 +":"+ appt.getStartMinute() + "pm" + " ," +  appt.getTitle()+ ", "+  appt.getDescription()+"\n", testString);
	 }
	 
	@Test
		public void test21() throws Throwable	{
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
		String testString = appt.toString();
	// assertions
	// testing with hour = 11, still valid
		 assertTrue(appt.getValid());
		 assertEquals("\t"+ appt.getStartMonth()+"/"+appt.getStartDay()+"/"+appt.getStartYear() + " at " +   11 +":"+ appt.getStartMinute() + "am" + " ," +  appt.getTitle()+ ", "+  appt.getDescription()+"\n", testString);
	 }
	 
	@Test
		public void test22() throws Throwable	{
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
		
		appt.setStartHour(-1);
				 
	// assertions
	
		 assertFalse(appt.getValid());
		 assertEquals(-1, appt.getStartHour());
	 }
	 
	 @Test
		public void test23() throws Throwable	{
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
		
		appt.setStartMinute(-1);
				 
	// assertions
	
		 assertFalse(appt.getValid());
		 assertEquals(-1, appt.getStartMinute());
	 }
	 
	@Test
		public void test24() throws Throwable	{
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
		
		appt.setStartMonth(-1);
				 
	// assertions
	
		 assertFalse(appt.getValid());
		 assertEquals(-1, appt.getStartMonth());
	 }

	@Test
		public void test25() throws Throwable	{
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
		
		appt.setStartDay(-1);
				 
	// assertions
	
		 assertFalse(appt.getValid());
		 assertEquals(-1, appt.getStartDay());
	 }
	 
	 @Test
		public void test26() throws Throwable	{
		int startHour=0;
		 int startMinute=0;
		 int startDay=1;
		 int startMonth=1;
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
				 
	// assertions
	
		 assertTrue(appt.getValid());
	 }
	 
	 @Test
		public void test27() throws Throwable	{
		int startHour=23;
		 int startMinute=59;
		 int startDay=31;
		 int startMonth=12;
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
				 
	// assertions
	
		 assertTrue(appt.getValid());
	 }
	 
}
