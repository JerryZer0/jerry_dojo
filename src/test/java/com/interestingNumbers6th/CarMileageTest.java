package com.interestingNumbers6th;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CarMileageTest {

  private static int interesting = 2;
  private static int boring = 0;

  @Test
  public void should_return_boring_when_execute_is_interesting_given_num_1_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(1, awesomePhrases);

    assertThat(result, is(boring));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_100_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(100, awesomePhrases);

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_boring_when_execute_is_interesting_given_num_10_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(10, awesomePhrases);

    assertThat(result, is(boring));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_111_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(111, awesomePhrases);

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_123_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(123, awesomePhrases);

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_321_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(321, awesomePhrases);

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_7890_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(7890, awesomePhrases);

    assertThat(result, is(interesting));
  }
}
