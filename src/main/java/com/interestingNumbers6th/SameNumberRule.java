package com.interestingNumbers6th;

public class SameNumberRule extends InterestingRule {

  SameNumberRule(int number, int[] area) {
    super(number, area);
  }

  @Override
  boolean isInteresting() {
    char first = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] != first) {
        return false;
      }
    }
    return true;
  }
}
