package com.bookshop5th;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BooksManagerTest {

  @Test
  public void should_return_40_when_call_total_price_given_5_books() {
    //given
    BookList list = new BookList(1, 1, 1, 1, 1);
    BooksManager booksManager = new BooksManager(list);
    //when
    float result = booksManager.getTotalPrice(list.getCounts(), 1);
    //then
    assertEquals(40.00, result, 0);
  }

  @Test
  public void should_return_a_plan_when_call_get_plan_given_5_different_books() {
    //given
    BookList list = new BookList(1, 1, 1, 1, 1);
    BooksManager booksManager = new BooksManager(list);
    //when
    List<Plan> plans = booksManager.getPlans();
    //then
    ArrayList<Integer> expect = new ArrayList<>();
    expect.add(5);
    assertEquals(expect, plans.get(0).getPlan());
  }

  @Test
  public void should_return_a_plan_when_call_get_plan_given_2_books_of_a_same_kind() {
    //given
    BookList list = new BookList(2, 0, 0, 0, 0);
    BooksManager booksManager = new BooksManager(list);
    //when
    List<Plan> plans = booksManager.getPlans();
    //then
    ArrayList<Integer> expect = new ArrayList<>();
    expect.add(1);
    expect.add(1);
    assertEquals(expect, plans.get(0).getPlan());
  }

  @Test
  public void should_return_discount_is_9_when_call_get_discount_given_books_count_is_3() {
    //given
    BookList list = new BookList(1, 1, 1, 0, 0);
    BooksManager booksManager = new BooksManager(list);
    //when
    float discount = booksManager.getDiscount(list.getCounts());
    //then
    assertEquals(0.9f, discount, 0);
  }

  @Test
  public void should_return_result_after_discount_when_call_calculate_given_5_books() {
    //given
    BookList list = new BookList(1, 1, 3, 1, 0);
    BooksManager booksManager = new BooksManager(list);
    //when
    float result = booksManager.calculate();

    //then
    assertEquals(41.6f, result, 0);
  }
}
