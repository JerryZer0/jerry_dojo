package com.interestingNumbers6th;

class DecrementingSequentialRule extends InterestingRule {

  DecrementingSequentialRule(int number, int[] area) {
    super(number, area);
  }

  @Override
  boolean isInteresting() {
    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] - 1 != numbers[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
