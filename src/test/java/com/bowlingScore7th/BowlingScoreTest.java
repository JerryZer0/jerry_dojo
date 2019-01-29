package com.bowlingScore7th;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class BowlingScoreTest {

  @Test
  public void should_return_90_when_call_calculate_score_given_ten_frames_with_no_total_pins_is_10() {
    List<BowlingFrame> bowlingList = initData();
    BowlingScore score = new BowlingScore(bowlingList).instance();

    int totalScore = score.calculate();

    assertEquals(90, totalScore);
  }

  @Test
  public void should_return_88_when_call_calculate_score_given_ten_frames_with_first_frame_total_score_is_7() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(0, new BowlingFrame(5, 2));
    BowlingScore score = new BowlingScore(bowlingList).instance();

    int totalScore = score.calculate();

    assertEquals(88, totalScore);
  }

  @Test
  public void should_return_98_when_call_calculate_score_given_ten_frames_with_first_frame_total_pins_is_10() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(0, new BowlingFrame(8, 2));
    BowlingScore score = new BowlingScore(bowlingList).instance();

    int totalScore = score.calculate();

    assertEquals(98, totalScore);
  }

  @Test
  public void should_return_98_when_call_calculate_score_given_ten_frames_with_second_frame_total_pins_is_10() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(1, new BowlingFrame(8, 2));
    BowlingScore score = new BowlingScore(bowlingList).instance();

    int totalScore = score.calculate();

    assertEquals(98, totalScore);
  }

  @Test
  public void should_return_96_when_call_calculate_score_given_ten_frames_with_last_frame_total_pins_is_10() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(9, new BowlingFrame(8, 2));
    BowlingScore score = new BowlingScore(bowlingList, Collections.singletonList(5)).instance();

    int totalScore = score.calculate();

    assertEquals(96, totalScore);
  }

  @Test
  public void should_return_100_when_call_calculate_score_given_ten_frames_with_first_frame_score_has_10() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(0, new BowlingFrame(10, 0));
    BowlingScore score = new BowlingScore(bowlingList).instance();

    int totalScore = score.calculate();

    assertEquals(100, totalScore);
  }

  @Test
  public void should_return_96_when_call_calculate_score_given_ten_frames_with_last_frame_score_has_10() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(9, new BowlingFrame(10, 0));
    List<Integer> externalScores = new ArrayList<>();
    externalScores.add(3);
    externalScores.add(2);
    BowlingScore score = new BowlingScore(bowlingList, externalScores).instance();

    int totalScore = score.calculate();

    assertEquals(96, totalScore);
  }

  @Test
  public void should_return_101_when_call_calculate_score_given_ten_frames_with_last_frame_total_pins_is_10() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(9, new BowlingFrame(2, 8));
    BowlingScore score = new BowlingScore(bowlingList, Collections.singletonList(10)).instance();

    int totalScore = score.calculate();

    assertEquals(101, totalScore);
  }

  @Test
  public void should_return_120_when_call_calculate_score_given_ten_frames_with_more_frames_total_pins_is_10() {
    List<BowlingFrame> bowlingList = initData();
    bowlingList.set(0, new BowlingFrame(10, 0));
    bowlingList.set(1, new BowlingFrame(8, 2));
    bowlingList.set(9, new BowlingFrame(2, 8));
    BowlingScore score = new BowlingScore(bowlingList, Collections.singletonList(10)).instance();

    int totalScore = score.calculate();

    assertEquals(120, totalScore);
  }

  private List<BowlingFrame> initData() {
    List<BowlingFrame> bowlingList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      BowlingFrame bowling = new BowlingFrame(7, 2);
      bowlingList.add(bowling);
    }
    return bowlingList;
  }
}
