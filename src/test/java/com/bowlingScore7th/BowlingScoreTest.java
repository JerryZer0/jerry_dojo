package com.bowlingScore7th;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BowlingScoreTest {

  @Test
  public void should_return_90_when_call_calculate_score_given_ten_groups_of_scores_with_no_total_score_bigger_than_10() {
    List<BowlingGroup> bowlingList = initData();
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(90, totalScore);
  }

  @Test
  public void should_return_99_when_call_calculate_score_given_ten_groups_of_scores_with_first_group_total_score_is_7() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(0, new BowlingGroup(5, 2));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(88, totalScore);
  }

  @Test
  public void should_return_99_when_call_calculate_score_given_ten_groups_of_scores_with_first_group_total_score_bigger_than_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(0, new BowlingGroup(8, 2));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(99, totalScore);
  }

  @Test
  public void should_return_99_when_call_calculate_score_given_ten_groups_of_scores_with_second_group_total_score_bigger_than_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(1, new BowlingGroup(8, 2));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(99, totalScore);
  }

  @Test
  public void should_return_96_when_call_calculate_score_given_ten_groups_of_scores_with_last_group_total_score_bigger_than_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(9, new BowlingGroup(8, 2));
    BowlingScore score = new BowlingScore(bowlingList);
    score.setExternalScore(5);

    int totalScore = score.calculate();

    assertEquals(96, totalScore);
  }


  @Test
  public void should_return_100_when_call_calculate_score_given_ten_groups_of_scores_with_first_group_has_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(0, new BowlingGroup(10, 0));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(100, totalScore);
  }

  private List<BowlingGroup> initData() {
    List<BowlingGroup> bowlingList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      BowlingGroup bowling = new BowlingGroup(8, 1);
      bowlingList.add(bowling);
    }
    return bowlingList;
  }
}