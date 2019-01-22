package com.interestingNumbers6th;

abstract class InterestingRule {
  int number;
  int area[];
  char[] numbers = String.valueOf(number).toCharArray();

  InterestingRule(int number, int[] area) {
    this.number = number;
    this.area = area;
  }

  abstract boolean isInteresting();
}
