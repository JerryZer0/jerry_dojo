package com.leapYear;

class LeapYear {

  private int year;

  LeapYear(int year) {
    this.year = year;
  }

  boolean isLeapYear() {
    return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
  }
}
