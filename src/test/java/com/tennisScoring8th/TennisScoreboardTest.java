package com.tennisScoring8th;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisScoreboardTest {

  @Test
  public void should_return_One_Love_when_calculate_given_1_turn_player1_has_one_point(){
    int player1 = 1;
    int player2 = 0;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("One-Love",result);
  }

  @Test
  public void should_return_Two_Love_when_calculate_given_2_turns_player1_has_2_points(){
    int player1 = 2;
    int player2 = 0;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("Two-Love",result);
  }

  @Test
  public void should_return_One_All_when_calculate_given_2_turns_player1_has_1_point_and_player2_has_1_point(){
    int player1 = 1;
    int player2 = 1;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("One-All",result);
  }

  @Test
  public void should_return_Player1_Win_when_calculate_given_4_turns_player1_has_4_points(){
    int player1 = 4;
    int player2 = 0;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("Player1-Win",result);
  }

  @Test
  public void should_return_Deuce_when_calculate_given_6_turns_player1_has_3_points_and_player2_has_3_points(){
    int player1 = 3;
    int player2 = 3;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("Deuce",result);
  }

  @Test
  public void should_return_Player1_Advantage_when_calculate_given_7_turns_player1_has_4_points_and_player2_has_3_points(){
    int player1 = 4;
    int player2 = 3;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("Player1-Advantage",result);
  }

  @Test
  public void should_return_Player1_Advantage_when_calculate_given_7_turns_player1_has_3_points_and_player2_has_4_points(){
    int player1 = 3;
    int player2 = 4;
    TennisScoreboard tennisScoreboard = new TennisScoreboard(player1,player2);

    String result = tennisScoreboard.calculate();

    assertEquals("Player2-Advantage",result);
  }
}