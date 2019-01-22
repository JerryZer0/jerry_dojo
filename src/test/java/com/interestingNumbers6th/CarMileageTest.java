package com.interestingNumbers6th;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CarMileageTest {

  private static int interesting = 2;
  private static int nearInteresting = 1;
  private static int boring = 0;

  @Test
  public void should_return_boring_when_execute_is_interesting_given_num_1_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(1, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(boring));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_100_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(100, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_boring_when_execute_is_interesting_given_num_10_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(10, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(boring));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_111_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(111, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_123_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(123, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_321_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(321, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_7890_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(7890, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_boring_when_execute_is_interesting_given_num_78901_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(78901, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(boring));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_1221_and_empty_array() {
    int awesomePhrases[] = {};
    CarMileage carMileage = new CarMileage(1221, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_256_and_a_array_contain_256() {
    int awesomePhrases[] = {256};
    CarMileage carMileage = new CarMileage(256, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(interesting));
  }



  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_254_and_a_array_contain_256() {
    int awesomePhrases[] = {256};
    CarMileage carMileage = new CarMileage(254, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(nearInteresting));
  }

  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_255_and_a_array_contain_256() {
    int awesomePhrases[] = {256};
    CarMileage carMileage = new CarMileage(255, awesomePhrases);

    int result = carMileage.isInteresting();

    assertThat(result, is(nearInteresting));
  }

}
