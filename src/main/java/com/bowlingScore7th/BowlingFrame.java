package com.bowlingScore7th;

class BowlingFrame {

  private int firstScore;
  private int secondScore;
  private final int BASE_SCORE = 1;

  BowlingFrame(int firstRoll, int secondRoll) {
    this.firstScore = firstRoll * BASE_SCORE;
    this.secondScore = secondRoll * BASE_SCORE;
  }

  int getFirstScore() {
    return firstScore;
  }

  public void setFirstScore(int firstScore) {
    this.firstScore = firstScore;
  }

  public int getSecondScore() {
    return secondScore;
  }

  public void setSecondScore(int secondScore) {
    this.secondScore = secondScore;
  }

  int getFrameScore() {
    return firstScore + secondScore;
  }
}
