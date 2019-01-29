package com.bowlingScore7th;

import java.util.List;

class BowlingScore {

  private List<BowlingGroup> bowlingList;
  private int externalScore;

  BowlingScore(List<BowlingGroup> bowlingList) {
    this.bowlingList = bowlingList;
  }

  public int getExternalScore() {
    return externalScore;
  }

  void setExternalScore(int externalScore) {
    this.externalScore = externalScore;
  }

  int calculate() {
    int totalScore = 0;
    int spare = 0;
    int strike = 0;
    for (int i = 0; i < 10; i++) {
      BowlingGroup bowlingGroup = bowlingList.get(i);
      if (bowlingGroup.getGroupScore() == 10 && i < 9) {
        if (bowlingGroup.getFirstScore() == 10) {
          strike += bowlingList.get(i + 1).getGroupScore();
        } else {
          spare += bowlingList.get(i + 1).getFirstScore();
        }
      }
      totalScore += bowlingGroup.getGroupScore();
    }
    totalScore += spare + strike + externalScore;
    return totalScore;
  }
}
