package com.interestingNumbers6th;

class SameNumberRule extends InterestingRule {

  SameNumberRule(int number) {
    super(number);
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
