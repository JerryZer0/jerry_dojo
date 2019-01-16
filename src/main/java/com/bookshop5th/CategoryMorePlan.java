package com.bookshop5th;

import java.util.ArrayList;
import java.util.List;

class CategoryMorePlan extends Plan {

  CategoryMorePlan(BookList bookList) {
    super(bookList);
  }

  @Override
  void pickBooks() {
    for (Integer i : getIndexList()) {
      if (bookList.getBooks().get(i) > 0) {
        bookList.getBooks().set(i, bookList.getBooks().get(i) - 1);
      }
    }
  }


  private List<Integer> getIndexList() {
    List<Integer> list = new ArrayList<>(books);
    int max;
    int index;
    List<Integer> indexList = new ArrayList<>();
    for (int j = 0; j < 4; j++) {
      max = -1;
      index = -1;
      for (int i = 0; i < 5; i++) {
        if (max < list.get(i)) {
          max = list.get(i);
          index = i;
        }
      }
      list.set(index, 0);
      indexList.add(index);
    }
    return indexList;
  }
}
