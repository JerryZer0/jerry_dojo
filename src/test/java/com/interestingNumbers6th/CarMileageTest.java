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

  @Test
  public void should_return_boring_when_execute_is_interesting_given_num_78901_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(78901, awesomePhrases);

    assertThat(result, is(boring));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_1221_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(1221, awesomePhrases);

    assertThat(result, is(interesting));
  }

  @Test
  public void should_return_interesting_when_execute_is_interesting_given_num_256_and_a_array_contain_256() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {256};

    int result = carMileage.isInteresting(256, awesomePhrases);

    assertThat(result, is(interesting));
  }



  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_254_and_a_array_contain_256() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {256};

    int result = carMileage.isInteresting(254, awesomePhrases);

    assertThat(result, is(nearInteresting));
  }

  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_255_and_a_array_contain_256() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {256};

    int result = carMileage.isInteresting(255, awesomePhrases);

    assertThat(result, is(nearInteresting));
  }

  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_799_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(799, awesomePhrases);

    assertThat(result, is(nearInteresting));
  }

  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_798_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(798, awesomePhrases);

    assertThat(result, is(nearInteresting));
  }

  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_109_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(109, awesomePhrases);

    assertThat(result, is(nearInteresting));
  }

  @Test
  public void should_return_near_interesting_when_execute_is_interesting_given_num_110_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(110, awesomePhrases);

    assertThat(result, is(nearInteresting));
  }
}
