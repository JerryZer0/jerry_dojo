package com.interestingNumbers6th;

class CarMileage {

  static int interesting = 2;
  static int boring = 0;

  int isInteresting(int mileage, int[] awesomePhrases) {
    if(mileage <100){
      return boring;
    }
    if (isFollowedByAllZeros(mileage)) {
      return interesting;
    }
    return boring;
  }

  private boolean isFollowedByAllZeros(int num) {
    while ((num % 10) == 0) {
      num = num / 10;
      if (num < 10) {
        return true;
      }
    }
    return false;
  }
}
