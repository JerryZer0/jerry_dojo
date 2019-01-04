package com.similarString;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimilarStrHandlerTest {

  @Test
  public void should_return_false_when_compare_two_strings_given_ab_and_abc() {
    //given
    SimilarStrHandler similarStrHandler = new SimilarStrHandler("ab", "abc");
    //when
    boolean key = similarStrHandler.compareSimilar();
    //then
    assertFalse(key);
  }

  @Test
  public void should_return_true_when_compare_two_strings_given_aa_and_aa() {
    //given
    SimilarStrHandler similarStrHandler = new SimilarStrHandler("aa", "aa");
    //when
    boolean key = similarStrHandler.compareSimilar();
    //then
    assertTrue(key);
  }

  @Test
  public void should_return_false_when_compare_two_strings_given_ab_and_ab() {
    //given
    SimilarStrHandler similarStrHandler = new SimilarStrHandler("ab", "ab");
    //when
    boolean key = similarStrHandler.compareSimilar();
    //then
    assertFalse(key);

  }

  @Test
  public void should_return_false_when_compare_two_strings_given_ab_and_ac() {
    //given
    SimilarStrHandler similarStrHandler = new SimilarStrHandler("ab", "ac");
    //when
    boolean key = similarStrHandler.compareSimilar();
    //then
    assertFalse(key);
  }

  @Test
  public void should_return_true_when_compare_two_strings_given_ab_and_ba() {
    //given
    SimilarStrHandler similarStrHandler = new SimilarStrHandler("ab", "ba");
    //when
    boolean key = similarStrHandler.compareSimilar();
    //then
    assertTrue(key);
  }

  @Test
  public void should_return_false_when_compare_two_strings_given_abc_and_bca() {
    //given
    SimilarStrHandler similarStrHandler = new SimilarStrHandler("abc", "bca");
    //when
    boolean key = similarStrHandler.compareSimilar();
    //then
    assertFalse(key);
  }
}