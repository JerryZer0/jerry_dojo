package com.bookshop5th;

import java.util.ArrayList;
import java.util.List;

class BookList {

  private List<Integer> books = new ArrayList<>();

  BookList(int firstCopy, int secondCopy, int thirdCopy, int fourthCopy, int fifthCopy) {
    books.add(firstCopy);
    books.add(secondCopy);
    books.add(thirdCopy);
    books.add(fourthCopy);
    books.add(fifthCopy);
  }

  int getCounts(){
    int counts=0;
    for(Integer count:books){
      counts+=count;
    }
    return counts ;
  }

  List<Integer> getBooks() {
    return books;
  }
}
