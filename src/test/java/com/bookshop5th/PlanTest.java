package com.bookshop5th;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class PlanTest {

  @Test
  public void should_return_category_max_plan_when_call_get_plan_and_new_category_max_instance() {

    BookList list = new BookList(2, 2, 3, 3, 1);
    Plan plan = new CategoryMaxPlan(list);

    List<Integer> result = plan.getPlan();

    ArrayList<Integer> expect = new ArrayList<>();
    expect.add(5);
    expect.add(4);
    expect.add(2);
    assertEquals(expect, result);
  }

  @Test
  public void should_return_category_more_plan_when_call_get_plan_and_new_category_more_instance() {

    BookList list = new BookList(2, 2, 3, 3, 1);
    Plan plan = new CategoryMorePlan(list);

    List<Integer> result = plan.getPlan();

    ArrayList<Integer> expect = new ArrayList<>();
    expect.add(4);
    expect.add(4);
    expect.add(3);
    assertEquals(expect, result);
  }

}
