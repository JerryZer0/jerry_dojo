package com.bookshop5th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BooksManager {
  private BookList list;
  private static final Map<Integer,Float> DISCOUNT_TABLE = new HashMap<>();
  static {
    DISCOUNT_TABLE.put(1, 1f);
    DISCOUNT_TABLE.put(2, 0.95f);
    DISCOUNT_TABLE.put(3, 0.9f);
    DISCOUNT_TABLE.put(4, 0.8f);
    DISCOUNT_TABLE.put(5, 0.75f);
  }
  BooksManager(BookList list) {
    this.list = list;
  }

  float getTotalPrice(int count, float discount) {
    float price = 8f;
    return price *count*discount;
  }

  List<Integer> getPlans() {
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

  float getDiscount(int count) {
    return DISCOUNT_TABLE.get(count);
  }

  float calculate() {
    float totalPrice = 0;
    for(Integer count:getPlans()){
      totalPrice += getTotalPrice(count,getDiscount(count));
    }
    return totalPrice;
  }
}
