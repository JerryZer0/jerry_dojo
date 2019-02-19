package com.tennisScoring8th;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisScoreboardTest {

  @Test
  public void should_One_Love_when_calculate_given_1_turn_player1_has_one_point(){
    int player1 = 1;
    int player2 = 0;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("One-Love",result);
  }

  @Test
  public void should_Two_Love_when_calculate_given_2_turns_player1_has_2_points(){
    int player1 = 2;
    int player2 = 0;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("Two-Love",result);
  }

  @Test
  public void should_Two_Love_when_calculate_given_2_turns_player1_has_1_point_and_player2_has_1_point(){
    int player1 = 1;
    int player2 = 1;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("One-All",result);
  }
}