package com.bookshop5th;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BooksManagerTest {

  @Test
  public void should_return_40_when_call_calcute_given_5_books(){
    //given
    BookList list = new BookList(1,1,1,1,1);
    BooksManager booksManager = new BooksManager(list);
    //when
    float result = booksManager.getTotalPrice();
    //then
    assertEquals(40.00, result,0);
  }

  @Test
  public void should_return_a_plan_when_call_get_plan_given_5_different_books(){
    //given
    BookList list = new BookList(1,1,1,1,1);
    BooksManager booksManager = new BooksManager(list);
    List<Integer> plans = new ArrayList<>();
    //when
    plans = booksManager.getPlans();
    //then
    assertEquals(1,plans.size());
    assertEquals(5,plans.get(0).intValue());
  }
}