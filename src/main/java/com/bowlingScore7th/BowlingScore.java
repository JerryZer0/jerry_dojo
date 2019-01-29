package com.bowlingScore7th;

import java.util.ArrayList;
import java.util.List;

class BowlingScore {

  private List<BowlingGroup> bowlingList;
  private List<Integer> externalScores = new ArrayList<>();
  private final int TOTAL_FRAMES = 10;

  BowlingScore(List<BowlingGroup> bowlingList) {
    this.bowlingList = bowlingList;
  }

  public List<Integer> getExternalScores() {
    return externalScores;
  }

  void setExternalScores(List<Integer> externalScores) {
    this.externalScores = externalScores;
  }

  int calculate() {
    int totalScore = 0;
    for (int i = 0; i < TOTAL_FRAMES - 1; i++) {
      BowlingGroup bowlingGroup = bowlingList.get(i);
      totalScore += bowlingGroup.getGroupScore();
      if (bowlingGroup.getFirstScore() == 10) {
        totalScore += bowlingList.get(i + 1).getGroupScore();
      } else if (bowlingGroup.getGroupScore() == 10) {
        totalScore += bowlingList.get(i + 1).getFirstScore();
      }
    }
    totalScore += bowlingList.get(TOTAL_FRAMES - 1).getGroupScore() + getTotalExternalScore();
    return totalScore;
  }

  private int getTotalExternalScore() {
    int totalExternalScore = 0;
    for (Integer score : externalScores) {
      totalExternalScore += score;
    }
    return totalExternalScore;
  }
}
