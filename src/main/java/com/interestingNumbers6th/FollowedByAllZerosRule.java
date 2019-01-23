package com.interestingNumbers6th;

class FollowedByAllZerosRule extends InterestingRule {

  private static char ZERO = '0';

  FollowedByAllZerosRule(int number) {
    super(number);
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
