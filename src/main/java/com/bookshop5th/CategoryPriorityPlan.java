package com.bookshop5th;

import java.util.ArrayList;
import java.util.List;

public class CategoryPriorityPlan extends Plan {


  public CategoryPriorityPlan(BookList bookList) {
    super(bookList);
  }

  @Override
  List<Integer> getPlan() {
    int counts = bookList.getCounts();
    List<Integer> plan = new ArrayList<>();
    while (counts > 0) {
      bookList.reduceBooks();
      int tempCounts = bookList.getCounts();
      plan.add(counts - tempCounts);
      counts = tempCounts;
    }
    return plan;
  }
}
