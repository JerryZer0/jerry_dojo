package com.bowlingScore7th;

import java.util.List;

class BowlingScore {

  private List<BowlingGroup> bowlingList;

  BowlingScore(List<BowlingGroup> bowlingList) {
    this.bowlingList = bowlingList;
  }

  int calculate() {
    int totalScore = 0;
    int spare = 0;
    for (int i = 0; i < 10; i++) {
      BowlingGroup bowlingGroup = bowlingList.get(i);
      if (bowlingGroup.getGroupScore() == 10){
        spare += bowlingList.get(i + 1).getFirstScore();
      }
      totalScore += bowlingGroup.getGroupScore();
    }
    totalScore += spare;
    return totalScore;
  }
}
