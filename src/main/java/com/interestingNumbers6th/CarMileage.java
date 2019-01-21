package com.interestingNumbers6th;

class CarMileage {

  private static int interesting = 2;
  private static int nearInteresting = 1;
  private static int boring = 0;

  int isInteresting(int mileage, int[] awesomePhrases) {
    if (mileage < 100) {
      return boring;
    }
    if (isInWesomePhrases(mileage, awesomePhrases)) {
      return interesting;
    }
    char[] mileages = String.valueOf(mileage).toCharArray();
    if (isFollowedByAllZeros(mileages)) {
      return interesting;
    }
    if (isSameNumber(mileages)) {
      return interesting;
    }
    if (isIncrementingSequential(mileages)) {
      return interesting;
    }
    if (isDecrementingSequential(mileages)) {
      return interesting;
    }
    if (isPalindrome(mileages)) {
      return interesting;
    }
    return isNearInteresting(mileage, awesomePhrases);
  }


  private int isNearInteresting(int mileage, int[] awesomePhrases) {
    if (isInWesomePhrases(mileage + 1, awesomePhrases) || isInWesomePhrases(mileage + 2, awesomePhrases)) {
      return nearInteresting;
    }
    char[] nexts = String.valueOf(mileage + 1).toCharArray();
    char[] nextNexts = String.valueOf(mileage + 2).toCharArray();
    if (isFollowedByAllZeros(nexts) || isFollowedByAllZeros(nextNexts)) {
      return nearInteresting;
    }
    if (isSameNumber(nexts) || isSameNumber(nextNexts)) {
      return nearInteresting;
    }
    if (isIncrementingSequential(nexts) || isIncrementingSequential(nextNexts)) {
      return nearInteresting;
    }
    if (isDecrementingSequential(nexts) || isDecrementingSequential(nextNexts)) {
      return nearInteresting;
    }
    if (isPalindrome(nexts)||isPalindrome(nextNexts)) {
      return nearInteresting;
    }
    return boring;
  }

  private boolean isInWesomePhrases(int mileage, int[] awesomePhrases) {
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
