package com.bookshop5th;


class CategoryMaxPlan extends Plan {


  CategoryMaxPlan(BookList bookList) {
    super(bookList);
  }

  @Override
  void pickBooks() {
    for (int i = 0; i < 5; i++) {
      if (books.get(i) > 0) {
        books.set(i, books.get(i) - 1);
      }
    }
  }
}
