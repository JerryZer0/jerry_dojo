package com.interestingNumbers6th;

abstract class InterestingRule {
  int number;
  int area[];
  char[] numbers;

  InterestingRule(int number, int[] area) {
    this.number = number;
    this.area = area;
    numbers = String.valueOf(number).toCharArray();
  }

  abstract boolean isInteresting();
}
