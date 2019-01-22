package com.interestingNumbers6th;

class InAwesomePhrasesRule extends InterestingRule {

  InAwesomePhrasesRule(int number, int[] area) {
    super(number, area);
  }

  @Override
  boolean isInteresting() {
    for (int awesomePhrase : area) {
      if (number == awesomePhrase) {
        return true;
      }
    }
    return false;
  }
}
