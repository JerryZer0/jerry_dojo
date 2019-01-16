package com.bookshop5th;

import java.util.List;

abstract class Plan {
  public BookList bookList;

  public Plan(BookList bookList) {
    this.bookList = bookList;
  }

  public BookList getBookList() {
    return bookList;
  }

  abstract List<Integer> getPlan();
}
