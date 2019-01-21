package com.interestingNumbers6th;

class CarMileage {

  private static int interesting = 2;
  private static int boring = 0;

  int isInteresting(int mileage, int[] awesomePhrases) {
    if (mileage < 100) {
      return boring;
    }
    char[] mileages = String.valueOf(mileage).toCharArray();
    if (isFollowedByAllZeros(mileages)) {
      return interesting;
    }
    if (isSameNumber(mileages)) {
      return interesting;
    }
    if(isSequential(mileages)){
      return interesting;
    }
    return boring;
  }

  private boolean isSequential(char[] mileages) {
    for (int i = 0; i < mileages.length-1; i++) {
      if (mileages[i]+1 != mileages[i+1]) {
        return false;
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
