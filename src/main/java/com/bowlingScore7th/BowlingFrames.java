package com.bowlingScore7th;

class BowlingFrames {

  private int firstScore;
  private int secondScore;
  private final int BASE_SCORE = 1;

  BowlingFrames(int firstPins, int secondPins) {
    this.firstScore = firstPins * BASE_SCORE;
    this.secondScore = secondPins * BASE_SCORE;
  }

  public int getFirstScore() {
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
