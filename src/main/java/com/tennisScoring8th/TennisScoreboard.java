package com.tennisScoring8th;

import java.util.HashMap;
import java.util.Map;

public class TennisScoreboard {

  int playerScore1;
  int playerScore2;
  static final Map<Integer, String> SCORE = new HashMap<>();
  String PLAYER1_WIN = "Player1-Win";
  String PLAYER2_WIN = "Player2-Win";
  String DEUCE = "Deuce";
  String PLAYER1_ADVANTAGE = "Player1-Advantage";
  String PLAYER2_ADVANTAGE = "Player2-Advantage";

  static {
    SCORE.put(0, "Love");
    SCORE.put(1, "One");
    SCORE.put(2, "Two");
    SCORE.put(3, "Three");
  }

  public TennisScoreboard instance() {
    if (playerScore1 == playerScore2) {
      return new EqualScore(playerScore1);
    }
    return this;
  }

  TennisScoreboard(int playerScore1, int playerScore2) {
    this.playerScore1 = playerScore1;
    this.playerScore2 = playerScore2;
  }

  public String calculate() {
    if (playerScore1 <= 3 && playerScore2 <= 3) {
      return SCORE.get(playerScore1) + "-" + SCORE.get(playerScore2);
    }
    if (playerScore1 - playerScore2 > 1 || playerScore2 - playerScore1 > 1) {
      return playerScore1 > playerScore2 ? PLAYER1_WIN : PLAYER2_WIN;
    }
    return playerScore1 > playerScore2 ? PLAYER1_ADVANTAGE : PLAYER2_ADVANTAGE;
  }
}
