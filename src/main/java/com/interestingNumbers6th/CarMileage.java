package com.interestingNumbers6th;

import java.util.ArrayList;
import java.util.List;

class CarMileage {

  private static int INTERESTING = 2;
  private static int NEAR_INTERESTING = 1;
  private static int BORING = 0;
  private static int ORIGIN = 0;
  private static int NEXT_ONE = 1;
  private static int NEXT_TWO = 2;
  private static int MIN_AREA = 100;

  private List<InterestingRule> rules = new ArrayList<>();

  private int mileage;
  private int[] awesomePhrases;

  public CarMileage(int mileage, int[] awesomePhrases) {
    this.mileage = mileage;
    this.awesomePhrases = awesomePhrases;
  }

  private void initRules(int mileage, int[] awesomePhrases) {
    rules.add(new DecrementingSequentialRule(mileage, awesomePhrases));
    rules.add(new FollowedByAllZerosRule(mileage, awesomePhrases));
    rules.add(new InAwesomePhrasesRule(mileage, awesomePhrases));
    rules.add(new IncrementingSequentialRule(mileage, awesomePhrases));
    rules.add(new PalindromeRule(mileage, awesomePhrases));
    rules.add(new SameNumberRule(mileage, awesomePhrases));
  }

  int isInteresting() {
    if (mileage < MIN_AREA) {
      return BORING;
    }
    if (executeRules(ORIGIN)) {
      return INTERESTING;
    }
    return (executeRules(NEXT_ONE) || executeRules(NEXT_TWO))?NEAR_INTERESTING:BORING;
  }

  private boolean executeRules(int i) {
    initRules(mileage + i, awesomePhrases);
    for (InterestingRule rule : rules) {
      if (rule.isInteresting()) {
        return true;
      }
    }
    return false;
  }
}
