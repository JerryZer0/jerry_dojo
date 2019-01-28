package com.bowlingScore7th;

import java.util.List;

class BowlingScore {

  private List<BowlingGroup> bowlingList;

  BowlingScore(List<BowlingGroup> bowlingList) {
    this.bowlingList = bowlingList;
  }

  int calculate() {
    int totalScore = 0;
    for(BowlingGroup bowling:bowlingList){
      totalScore+= bowling.getGroupScore();
    }
    return totalScore;
  }
}
