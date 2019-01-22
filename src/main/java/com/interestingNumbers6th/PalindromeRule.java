package com.interestingNumbers6th;

class PalindromeRule extends InterestingRule {

  PalindromeRule(int number, int[] area) {
    super(number, area);
  }

  @Override
  boolean isInteresting() {
    int middle = numbers.length / 2;
    for (int i = 0; i < middle; i++) {
      if (numbers[i] != numbers[numbers.length - i - 1]) {
        return false;
      }
    }
    return true;
  }
}
