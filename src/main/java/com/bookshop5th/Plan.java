package com.bookshop5th;

import java.util.ArrayList;
import java.util.List;

abstract class Plan {

  BookList bookList;
  List<Integer> books;

  Plan(BookList bookList) {
    this.bookList = bookList;
    this.books = bookList.getBooks();

  }

  List<Integer> getPlan() {
    int counts = bookList.getCounts();
    List<Integer> plan = new ArrayList<>();
    while (counts > 0) {
      pickBooks();
      int tempCounts = bookList.getCounts();
      plan.add(counts - tempCounts);
      counts = tempCounts;
    }
    return plan;
  }

  abstract void pickBooks();
}
