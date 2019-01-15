package com.bookshop5th;

import java.util.ArrayList;
import java.util.Arrays;
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
    int counts = list.getCounts();
    List<Integer> plans = new ArrayList<>();
    while(counts>0){
      list.reduceBooks();
      int tempCounts = list.getCounts();
      plans.add(counts-tempCounts);
      counts = tempCounts;
    }
    return plans;
  }

}
