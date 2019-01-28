package com.bowlingScore7th;

public class Bowling {
  private int firstScore;
  private int secondScore;

  public Bowling(int firstScore, int secondScore) {
    this.firstScore = firstScore;
    this.secondScore = secondScore;
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
}
