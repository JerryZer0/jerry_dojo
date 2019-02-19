package com.tennisScoring8th;

class TennisScoreboard {

  private int playerScore1;
  private int playerScore2;

  TennisScoreboard(int playerScore1, int playerScore2) {
    this.playerScore1 = playerScore1;
    this.playerScore2 = playerScore2;
  }

  public String calculate() {
    return "One-Love";
  }
}
