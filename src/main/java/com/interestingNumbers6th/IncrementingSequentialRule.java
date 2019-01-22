package com.interestingNumbers6th;

public class IncrementingSequentialRule extends InterestingRule {

  IncrementingSequentialRule(int number, int[] area) {
    super(number, area);
  }

  @Override
  boolean isInteresting() {
    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] + 1 != numbers[i + 1]) {
        return numbers[i] == '9' && numbers[i + 1] == '0' && (i + 2 == numbers.length);
      }
    }
    return true;
  }
}
