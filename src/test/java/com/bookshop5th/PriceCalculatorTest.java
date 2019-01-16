package com.bookshop5th;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceCalculatorTest {

  @Test
  public void should_return_40_when_call_total_price_given_5_books() {
    //given
    BookList list = new BookList(1, 1, 1, 1, 1);
    PriceCalculator priceCalculator = new PriceCalculator(new CategoryMaxPlan(list));
    //when
    float result = priceCalculator.getTotalPrice(list.getCounts(), 1);
    //then
    assertEquals(40.00, result, 0);
  }



  @Test
  public void should_return_discount_is_9_when_call_get_discount_given_books_count_is_3() {
    //given
    BookList list = new BookList(1, 1, 1, 0, 0);
    PriceCalculator priceCalculator = new PriceCalculator(new CategoryMaxPlan(list));
    //when
    float discount = priceCalculator.getDiscount(list.getCounts());
    //then
    assertEquals(0.9f, discount, 0);
  }

  @Test
  public void should_return_result_after_discount_when_call_calculate_given_5_books() {
    //given
    BookList list = new BookList(1, 1, 3, 1, 0);
    PriceCalculator priceCalculator = new PriceCalculator(new CategoryMaxPlan(list));
    //when
    float result = priceCalculator.calculate();

    //then
    assertEquals(41.6f, result, 0);
  }


}
