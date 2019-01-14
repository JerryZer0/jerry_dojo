package com.bookshop5th;

import static org.junit.Assert.assertEquals;

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
}