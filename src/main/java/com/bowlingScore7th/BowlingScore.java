package com.bowlingScore7th;

import java.util.ArrayList;
import java.util.List;

class BowlingScore {

  private List<BowlingGroup> bowlingList;
  private final int TOTAL_FRAMES = 10;
  private final int MAX_SCORE = 10;
  List<Integer> externalScores = new ArrayList<>();

  BowlingScore(List<BowlingGroup> bowlingList) {
    this.bowlingList = bowlingList;
  }

  BowlingScore(List<BowlingGroup> bowlingList, List<Integer> externalScores) {
    this.bowlingList = bowlingList;
    this.externalScores = externalScores;
  }

  BowlingScore instance() {
    if (bowlingList.get(TOTAL_FRAMES - 1).getGroupScore() == MAX_SCORE) {
      return new ExternalBowlingScore(bowlingList, externalScores);
    }
    return this;
  }

  int calculate() {
    int totalScore = 0;
    for (int i = 0; i < TOTAL_FRAMES - 1; i++) {
      BowlingGroup bowlingGroup = bowlingList.get(i);
      totalScore += bowlingGroup.getGroupScore();
      if (bowlingGroup.getFirstScore() == MAX_SCORE) {
        totalScore += bowlingList.get(i + 1).getGroupScore();
      } else if (bowlingGroup.getGroupScore() == MAX_SCORE) {
        totalScore += bowlingList.get(i + 1).getFirstScore();
      }
    }
    totalScore += bowlingList.get(TOTAL_FRAMES - 1).getGroupScore();
    return totalScore;
  }
}
