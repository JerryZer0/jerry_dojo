package com.interestingNumbers6th;

public class FollowedByAllZerosRule extends InterestingRule {

  private static char ZERO = '0';

  public FollowedByAllZerosRule(int number, int[] area) {
    super(number, area);
  }

  @Override
  boolean isInteresting() {
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] != ZERO) {
        return false;
      }
    }
    return true;
  }
}
