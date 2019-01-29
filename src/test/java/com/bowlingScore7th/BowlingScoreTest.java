package com.bowlingScore7th;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class BowlingScoreTest {

  @Test
  public void should_return_90_when_call_calculate_score_given_ten_groups_of_scores_with_no_total_score_is_10() {
    List<BowlingGroup> bowlingList = initData();
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(90, totalScore);
  }

  @Test
  public void should_return_88_when_call_calculate_score_given_ten_groups_of_scores_with_first_group_total_score_is_7() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(0, new BowlingGroup(5, 2));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(88, totalScore);
  }

  @Test
  public void should_return_98_when_call_calculate_score_given_ten_groups_of_scores_with_first_group_total_score_is_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(0, new BowlingGroup(8, 2));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(98, totalScore);
  }

  @Test
  public void should_return_98_when_call_calculate_score_given_ten_groups_of_scores_with_second_group_total_score_is_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(1, new BowlingGroup(8, 2));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(98, totalScore);
  }

  @Test
  public void should_return_96_when_call_calculate_score_given_ten_groups_of_scores_with_last_group_total_score_is_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(9, new BowlingGroup(8, 2));
    BowlingScore score = new BowlingScore(bowlingList);
    score.setExternalScores(Arrays.asList(5));

    int totalScore = score.calculate();

    assertEquals(96, totalScore);
  }

  @Test
  public void should_return_100_when_call_calculate_score_given_ten_groups_of_scores_with_first_group_score_has_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(0, new BowlingGroup(10, 0));
    BowlingScore score = new BowlingScore(bowlingList);

    int totalScore = score.calculate();

    assertEquals(100, totalScore);
  }

  @Test
  public void should_return_96_when_call_calculate_score_given_ten_groups_of_scores_with_last_group_score_has_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(9, new BowlingGroup(10, 0));
    BowlingScore score = new BowlingScore(bowlingList);
    List<Integer> externalScores = new ArrayList<>();
    externalScores.add(3);
    externalScores.add(2);
    score.setExternalScores(externalScores);

    int totalScore = score.calculate();

    assertEquals(96, totalScore);
  }

  @Test
  public void should_return_101_when_call_calculate_score_given_ten_groups_of_scores_with_last_group_total_score_is_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(9, new BowlingGroup(2, 8));
    BowlingScore score = new BowlingScore(bowlingList);
    score.setExternalScores(Arrays.asList(10));

    int totalScore = score.calculate();

    assertEquals(101, totalScore);
  }

  @Test
  public void should_return_120_when_call_calculate_score_given_ten_groups_of_scores_with_more_group_total_score_is_10() {
    List<BowlingGroup> bowlingList = initData();
    bowlingList.set(0, new BowlingGroup(10, 0));
    bowlingList.set(1, new BowlingGroup(8, 2));
    bowlingList.set(9, new BowlingGroup(2, 8));
    BowlingScore score = new BowlingScore(bowlingList);
    score.setExternalScores(Arrays.asList(10));

    int totalScore = score.calculate();

    assertEquals(120, totalScore);
  }

  private List<BowlingGroup> initData() {
    List<BowlingGroup> bowlingList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      BowlingGroup bowling = new BowlingGroup(7, 2);
      bowlingList.add(bowling);
    }
    return bowlingList;
  }
}