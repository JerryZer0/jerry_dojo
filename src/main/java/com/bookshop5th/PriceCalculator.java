package com.bookshop5th;

import java.util.HashMap;
import java.util.Map;

class PriceCalculator {

  private Plan plan;
  private static final Map<Integer, Float> DISCOUNT_TABLE = new HashMap<>();

  static {
    DISCOUNT_TABLE.put(1, 1f);
    DISCOUNT_TABLE.put(2, 0.95f);
    DISCOUNT_TABLE.put(3, 0.9f);
    DISCOUNT_TABLE.put(4, 0.8f);
    DISCOUNT_TABLE.put(5, 0.75f);
  }

  PriceCalculator(Plan plan) {
    this.plan = plan;
  }

  float getTotalPrice(int count, float discount) {
    float price = 8f;
    return price * count * discount;
  }

  float getDiscount(int count) {
    return DISCOUNT_TABLE.get(count);
  }

  float calculate() {
    float totalPrice = 0;
    for (Integer count : plan.getPlan()) {
      totalPrice += getTotalPrice(count, getDiscount(count));
    }
    return totalPrice;
  }
}
