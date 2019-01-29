package com.bowlingScore7th;

import java.util.List;

public class ExternalBowlingScore extends BowlingScore {

  ExternalBowlingScore(List<BowlingGroup> bowlingList, List<Integer> externalScores) {
    super(bowlingList, externalScores);
  }

  @Override
  int calculate() {
    return super.calculate() + getTotalExternalScore();
  }

  private int getTotalExternalScore() {
    int totalExternalScore = 0;
    for (Integer score : externalScores) {
      totalExternalScore += score;
    }
    return totalExternalScore;
  }
}
