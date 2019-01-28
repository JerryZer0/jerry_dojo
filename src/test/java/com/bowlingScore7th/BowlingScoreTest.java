package com.bowlingScore7th;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BowlingScoreTest {

  @Test
  public void should_return_90_when_call_calculate_score_given_ten_groups_of_scores_with_no_total_score_bigger_than_10(){
    List<Bowling> bowlingList = initData();
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(90,totalScore);
  }

  @Test
  public void should_return_99_when_call_calculate_score_given_ten_groups_of_scores_with_first_group_total_score_is_7(){
    List<Bowling> bowlingList = initData();
    bowlingList.set(0,new Bowling(5,2));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(88,totalScore);
  }

  protected List<Bowling> initData(){
    List<Bowling> bowlingList = new ArrayList<>();
    for (int i=0;i<10;i++){
      Bowling bowling = new Bowling(8,1);
      bowlingList.add(bowling);
    }
    return bowlingList;
  }
}