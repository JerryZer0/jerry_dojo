package com.interestingNumbers6th;

import java.util.ArrayList;
import java.util.List;

class CarMileage {

  private static int INTERESTING = 2;
  private static int NEAR_INTERESTING = 1;
  private static int BORING = 0;
  private List<InterestingRule> rules= new ArrayList<>();

  private int mileage;
  private int awesomePhrases[];

  public CarMileage(int mileage, int[] awesomePhrases) {
    this.mileage = mileage;
    this.awesomePhrases = awesomePhrases;
    initRules();
  }

  private void initRules() {
    rules.add(new DecrementingSequentialRule(mileage,awesomePhrases));
    rules.add(new FollowedByAllZerosRule(mileage,awesomePhrases));
    rules.add(new InAwesomePhrasesRule(mileage,awesomePhrases));
    rules.add(new IncrementingSequentialRule(mileage,awesomePhrases));
    rules.add(new PalindromeRule(mileage,awesomePhrases));
    rules.add(new SameNumberRule(mileage,awesomePhrases));
  }

  int isInteresting() {
    if (mileage < 100) {
      return BORING;
    }
    for(InterestingRule rule:rules){
      if(rule.isInteresting()){
        return INTERESTING;
      }
    }
    return isNearInteresting(mileage, awesomePhrases);
  }

  private int isNearInteresting(int mileage, int[] awesomePhrases) {
    if (isInAwesomePhrases(mileage + 1, awesomePhrases) || isInAwesomePhrases(mileage + 2, awesomePhrases)) {
      return NEAR_INTERESTING;
    }
    char[] nexts = String.valueOf(mileage + 1).toCharArray();
    char[] nextNexts = String.valueOf(mileage + 2).toCharArray();
    if (isFollowedByAllZeros(nexts) || isFollowedByAllZeros(nextNexts)) {
      return NEAR_INTERESTING;
    }
    if (isSameNumber(nexts) || isSameNumber(nextNexts)) {
      return NEAR_INTERESTING;
    }
    if (isIncrementingSequential(nexts) || isIncrementingSequential(nextNexts)) {
      return NEAR_INTERESTING;
    }
    if (isDecrementingSequential(nexts) || isDecrementingSequential(nextNexts)) {
      return NEAR_INTERESTING;
    }
    if (isPalindrome(nexts)||isPalindrome(nextNexts)) {
      return NEAR_INTERESTING;
    }
    return BORING;
  }

  boolean isInAwesomePhrases(int mileage, int[] awesomePhrases) {
    for (int awesomePhrase : awesomePhrases) {
      if (mileage == awesomePhrase) {
        return true;
      }
    }
    return false;
  }

  private boolean isPalindrome(char[] mileages) {
    int middle = mileages.length / 2;
    for (int i = 0; i < middle; i++) {
      if (mileages[i] != mileages[mileages.length - i - 1]) {
        return false;
      }
    }
    return true;
  }

  private boolean isDecrementingSequential(char[] mileages) {
    for (int i = 0; i < mileages.length - 1; i++) {
      if (mileages[i] - 1 != mileages[i + 1]) {
        return false;
      }
    }
    return true;
  }

  private boolean isIncrementingSequential(char[] mileages) {
    for (int i = 0; i < mileages.length - 1; i++) {
      if (mileages[i] + 1 != mileages[i + 1]) {
        return mileages[i] == '9' && mileages[i + 1] == '0' && (i + 2 == mileages.length);
      }
    }
    return true;
  }


  private boolean isSameNumber(char[] mileages) {
    char first = mileages[0];
    for (int i = 1; i < mileages.length; i++) {
      if (mileages[i] != first) {
        return false;
      }
    }
    return true;
  }

  private boolean isFollowedByAllZeros(char[] mileages) {
    for (int i = 1; i < mileages.length; i++) {
      if (mileages[i] != '0') {
        return false;
      }
    }
    return true;
  }

}
