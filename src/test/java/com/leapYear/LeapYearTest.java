package com.leapYear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

  @Test
  public void should_return_true_when_isLeapYear_given_4() {
    //given
    LeapYear leapYear = new LeapYear(4);

    //when
    boolean result = leapYear.isLeapYear();

    //then
    Assert.assertTrue(result);

  }

  @Test
  public void should_return_false_when_not_fit_leapYear_given_1() {
    //given
    LeapYear leapYear = new LeapYear(1);

    //when
    boolean result = leapYear.isLeapYear();

    //then
    Assert.assertFalse(result);
  }

  @Test
  public void should_return_false_when_not_fit_leap_year_given_100() {
    //given
    LeapYear leapYear = new LeapYear(100);

    //when
    boolean result = leapYear.isLeapYear();

    //then
    Assert.assertFalse(result);
  }

  @Test
  public void should_return_true_when_fit_leap_year_given_400() {
    //given
    LeapYear leapYear = new LeapYear(400);

    //when
    boolean result = leapYear.isLeapYear();

    //then
    Assert.assertTrue(result);
  }

}