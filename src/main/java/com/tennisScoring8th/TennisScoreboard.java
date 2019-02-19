package com.tennisScoring8th;

import java.util.HashMap;
import java.util.Map;

class TennisScoreboard {

  private int playerScore1;
  private int playerScore2;

  private static final Map<Integer, String> SCORE = new HashMap<>();
  String PLAYER1_WIN = "Player1-Win";
  String PLAYER2_WIN = "Player2-Win";
  String DEUCE = "Deuce";

  static {
    SCORE.put(0, "Love");
    SCORE.put(1, "One");
    SCORE.put(2, "Two");
    SCORE.put(3, "Three");
  }

  TennisScoreboard(int playerScore1, int playerScore2) {
    this.playerScore1 = playerScore1;
    this.playerScore2 = playerScore2;
  }

  public String calculate() {
    if ( (playerScore1 <= 3 && playerScore2 < 3) || (playerScore1 < 3 && playerScore2 <= 3)) {
      if (playerScore1 == playerScore2) {
        return SCORE.get(playerScore1) + "-All";
      }
      return SCORE.get(playerScore1) + "-" + SCORE.get(playerScore2);
    }
    if (playerScore1 == playerScore2) {
      return DEUCE;
    }
    return playerScore1>playerScore2? PLAYER1_WIN : PLAYER2_WIN;
  }
}
