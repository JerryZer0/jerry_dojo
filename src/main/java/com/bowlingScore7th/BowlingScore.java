package com.bowlingScore7th;

import java.util.ArrayList;
import java.util.List;

class BowlingScore {

  private List<BowlingFrames> bowlingList;
  private final int TOTAL_FRAMES = 10;
  private final int MAX_SCORE = 10;
  List<Integer> externalScores = new ArrayList<>();

  BowlingScore(List<BowlingFrames> bowlingList) {
    this.bowlingList = bowlingList;
  }

  BowlingScore(List<BowlingFrames> bowlingList, List<Integer> externalScores) {
    this.bowlingList = bowlingList;
    this.externalScores = externalScores;
  }

  BowlingScore instance() {
    if (bowlingList.get(TOTAL_FRAMES - 1).getFrameScore() == MAX_SCORE) {
      return new ExternalBowlingScore(bowlingList, externalScores);
    }
    return this;
  }

  int calculate() {
    int totalScore = 0;
    for (int i = 0; i < TOTAL_FRAMES - 1; i++) {
      BowlingFrames bowlingFrames = bowlingList.get(i);
      totalScore += bowlingFrames.getFrameScore();
      if (bowlingFrames.getFirstScore() == MAX_SCORE) {
        totalScore += bowlingList.get(i + 1).getFrameScore();
      } else if (bowlingFrames.getFrameScore() == MAX_SCORE) {
        totalScore += bowlingList.get(i + 1).getFirstScore();
      }
    }
    totalScore += bowlingList.get(TOTAL_FRAMES - 1).getFrameScore();
    return totalScore;
  }
}
