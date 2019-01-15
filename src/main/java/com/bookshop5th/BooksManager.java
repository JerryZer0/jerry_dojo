package com.bookshop5th;

import java.util.List;

public class BooksManager {
  private BookList list;
  private static float PRICE = (float) 8;

  public BooksManager(BookList list) {
    this.list = list;
  }

  public float getTotalPrice() {
    return PRICE*list.getCounts();
  }

  public List<Integer> getPlans() {
    return null;
  }
}
