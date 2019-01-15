package com.bookshop5th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksManager {
  private BookList list;
  private static float PRICE = (float) 8;
  private static final Map<Integer,Float> DISCOUNT_TABLE = new HashMap<>();
  static {
    DISCOUNT_TABLE.put(1, 1f);
    DISCOUNT_TABLE.put(2, 0.95f);
    DISCOUNT_TABLE.put(3, 0.9f);
    DISCOUNT_TABLE.put(4, 0.8f);
    DISCOUNT_TABLE.put(5, 0.75f);
  }
  public BooksManager(BookList list) {
    this.list = list;
  }

  public float getTotalPrice(int count, float discount) {
    return PRICE*count*discount;
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

  public float getDiscount(int count) {
    float discount = DISCOUNT_TABLE.get(count);
    return discount;
  }

  public float calculate() {
    float totalPrice = 0;
    for(Integer count:getPlans()){
      totalPrice += getTotalPrice(count,getDiscount(count));
    }
    return totalPrice;
  }
}
