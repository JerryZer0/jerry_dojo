package com.bowlingScore7th;

import java.util.List;

class BowlingScore {

  private List<BowlingGroup> bowlingList;
  private int externalScore;
  private int totalFrames;

  BowlingScore(List<BowlingGroup> bowlingList) {
    this.bowlingList = bowlingList;
    totalFrames = bowlingList.size();
  }

  public int getExternalScore() {
    return externalScore;
  }

  void setExternalScore(int externalScore) {
    this.externalScore = externalScore;
  }

  int calculate() {
    int totalScore = 0;
    for (int i = 0; i < totalFrames - 1; i++) {
      BowlingGroup bowlingGroup = bowlingList.get(i);
      totalScore += bowlingGroup.getGroupScore();
      if (isSpareOrStrike(bowlingGroup.getGroupScore())) {
        if (isStrike(bowlingGroup.getFirstScore())) {
          totalScore += bowlingList.get(i + 1).getGroupScore();
        } else {
          totalScore += bowlingList.get(i + 1).getFirstScore();
        }
      }
    }
    totalScore += bowlingList.get(totalFrames - 1).getGroupScore() + externalScore;
    return totalScore;
  }

  private boolean isStrike(int firstScore) {
    return firstScore == 10;
  }

  private boolean isSpareOrStrike(int groupScore) {
    return groupScore == 10;
  }
}
