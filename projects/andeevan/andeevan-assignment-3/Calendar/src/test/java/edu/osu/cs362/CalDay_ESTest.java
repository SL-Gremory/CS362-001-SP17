/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 04:38:54 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
//import org.evosuite.runtime.mock.java.util.GregorianCalendar;
//import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CalDay_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(12, 12, 12, 12, 12, "7{s;}lR", "7{s;}lR");
      calDay0.addAppt(appt0);
      calDay0.addAppt(appt0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(168, "(I*]");
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar((TimeZone) simpleTimeZone0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.year = (-2159);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.appts.add((Appt) null);
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(276, 276, 276);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = 2263;
      calDay0.month = (-25);
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.day = (-1184);
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(168, "(I*]");
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar((TimeZone) simpleTimeZone0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.appts;
      Appt appt0 = new Appt(168, 1, 168, 24, 0, "(I*]", "org.apache.oro.io.Perl5FilenameFilter");
      linkedList0.add(appt0);
      calDay0.getAppts();
  }

  /*@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try { 
        calDay0.iterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }

  /*@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      // Undeclared exception!
      try { 
        calDay0.getSizeAppts();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }*/

  /*@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }*/

  /*@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field) ", 0, 0, 0, 0, 0, 0, 0, 0);
      Locale locale0 = Locale.CHINA;
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar((TimeZone) simpleTimeZone0, locale0);
      mockGregorianCalendar0.set(0, 840);
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         //assertThrownBy("java.util.GregorianCalendar", e);
      }
  }*/

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(168, "(I*]");
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar((TimeZone) simpleTimeZone0);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.appts.add((Appt) null);
      calDay0.toString();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.toString();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.iterator();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(0, 62, 0, 62, 62);
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      Appt appt0 = new Appt(62, 2, 0, 62, 5, "org.evosuite.runtime.mock.java.util.GregorianCalendar[time=-62004301080000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=61,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", "org.evosuite.runtime.mock.java.util.GregorianCalendar[time=-62004301080000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=61,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(2, 0, 2, 2, 2, "org.evosuite.runtime.mock.java.util.GregorianCalendar[time=-62004301080000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=61,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", "org.evosuite.runtime.mock.java.util.GregorianCalendar[time=-62004301080000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=61,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
      calDay0.addAppt(appt1);
      assertEquals(2, calDay0.getDay());
      assertEquals(2, calDay0.getMonth());
      assertEquals(5, calDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(0, 1142, 11, 0, 83, "JZCRvXB", "JZCRvXB");
      linkedList0.add(appt0);
      calDay0.appts = linkedList0;
      Appt appt1 = new Appt(11, 11, 11, 11, 11, " --- \n", " --- \n");
      calDay0.addAppt(appt1);
      assertEquals(0, calDay0.getMonth());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt((-3434), (-3434), 1842, (-3434), (-3434), "K{&", "7$UkY_cYA>GWY0");
      calDay0.addAppt(appt0);
      assertEquals("K{&", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      calDay0.getSizeAppts();
      assertTrue(calDay0.isValid());
      assertEquals(4, calDay0.getMonth());
      assertEquals(15, calDay0.getDay());
      assertEquals(2017, calDay0.getYear());
  }

  /*@Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(11, 11, 11, 11, 11, " --- \n", " --- \n");
      // Undeclared exception!
      try { 
        calDay0.addAppt(appt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("edu.osu.cs362.CalDay", e);
      }
  }*/

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getMonth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Iterator<?> iterator0 = calDay0.iterator();
      assertNull(iterator0);
  }
}
