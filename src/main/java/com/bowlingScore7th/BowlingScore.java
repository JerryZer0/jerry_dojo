package com.bowlingScore7th;

import java.util.ArrayList;
import java.util.List;

class BowlingScore {

  private List<BowlingFrame> bowlingList;
  private final int TOTAL_FRAMES = 10;
  private final int MAX_SCORE = 10;
  List<Integer> externalScores = new ArrayList<>();
  private int spare = 0;
  private int strike = 0;
  private int baseScore = 0;

  BowlingScore(List<BowlingFrame> bowlingList) {
    this.bowlingList = bowlingList;
  }

  BowlingScore(List<BowlingFrame> bowlingList, List<Integer> externalScores) {
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
    baseScore = bowlingList.get(TOTAL_FRAMES - 1).getFrameScore();
    for (int i = 0; i < TOTAL_FRAMES - 1; i++) {
      BowlingFrame bowlingFrame = bowlingList.get(i);
      calculateBaseScore(bowlingFrame);
      if (bowlingFrame.getFirstScore() == MAX_SCORE) {
        calcuteStrike(bowlingList.get(i + 1));
      } else if (bowlingFrame.getFrameScore() == MAX_SCORE) {
        calculateSpare(bowlingList.get(i + 1));
      }
    }
    return baseScore + spare + strike;
  }

  private void calculateBaseScore(BowlingFrame bowlingFrame) {
    baseScore += bowlingFrame.getFrameScore();
  }

  private void calculateSpare(BowlingFrame bowlingFrame) {
    spare += bowlingFrame.getFirstScore();
  }

  private void calcuteStrike(BowlingFrame bowlingFrame) {
    strike += bowlingFrame.getFrameScore();
  }
}
