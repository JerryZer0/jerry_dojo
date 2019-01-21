package com.interestingNumbers6th;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CarMileageTest {

  @Test
  public void should_return_0_when_execute_is_interesting_given_num_1_and_empty_array() {
    CarMileage carMileage = new CarMileage();
    int awesomePhrases[] = {};

    int result = carMileage.isInteresting(1, awesomePhrases);

    assertThat(result, is(0));
  }
}
