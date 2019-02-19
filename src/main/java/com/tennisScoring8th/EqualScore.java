package com.tennisScoring8th;

public class EqualScore extends TennisScoreboard {


  EqualScore(int playerScore) {
    super(playerScore, playerScore);
  }

  @Override
  public String calculate() {
    if (playerScore1 < 3) {
      return SCORE.get(playerScore1) + "-All";
    }
    return DEUCE;
  }
}
