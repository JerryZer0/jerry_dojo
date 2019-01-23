package com.interestingNumbers6th;

class IncrementingSequentialRule extends InterestingRule {

  IncrementingSequentialRule(int number) {
    super(number);
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
