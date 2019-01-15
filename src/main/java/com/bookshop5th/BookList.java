package com.bookshop5th;

import java.util.ArrayList;
import java.util.List;

public class BookList {

  private List<Integer> books = new ArrayList<>();

  public BookList(int firstCopy, int secondCopy, int thirdCopy, int fourthCopy, int fifthCopy) {
    books.add(firstCopy);
    books.add(secondCopy);
    books.add(thirdCopy);
    books.add(fourthCopy);
    books.add(fifthCopy);
  }

  public int getCounts(){
    int counts=0;
    for(Integer count:books){
      counts+=count;
    }
    return counts ;
  }

  public void reduceBooks(){
    for(int i=0;i<5;i++){
      if(books.get(i)>0){
        books.set(i,books.get(i)-1);
      }
    }
  }
}
