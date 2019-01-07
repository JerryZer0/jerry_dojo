package com.calculatePrice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CalculatePriceTest {

  @Test
  public void should_return_ticket_info_with_no_discount_when_call_printTicket_given_one_kind_good_with_total_price_less_than_1000_in_UT() {
    //given
    List<Item> items = new ArrayList<>();
    Item apple = new Item("apple", 1, 800.0);
    items.add(apple);
    CalculatePrice calculatePrice = new CalculatePrice(items, "UT");
    //when
    String ticket = calculatePrice.getTicketInfo();
    String expectResult = "apple        1        800.0        800.0\n"
        + "\n"
        + "----------------------------------------\n"
        + "Total without taxes                  800.0\n"
        + "Discout 0%                           -0.0\n"
        + "Tax  6.85%                           +54.8\n"
        + "----------------------------------------\n"
        + "Total price                          854.8";
    //then
    assertEquals(expectResult, ticket);
  }

  @Test
  public void should_return_ticket_info_with_no_discount_when_call_printTicket_given_two_kinds_good_with_total_price_less_than_1000_in_UT() {
    //given
    List<Item> items = new ArrayList<>();
    Item apple = new Item("apple", 1, 400.0);
    items.add(apple);
    Item banana = new Item("banana", 1, 400.0);
    items.add(banana);
    CalculatePrice calculatePrice = new CalculatePrice(items, "UT");
    //when
    String ticket = calculatePrice.getTicketInfo();
    String expectResult = "apple        1        400.0        400.0\n"
        + "banana        1        400.0        400.0\n"
        + "\n"
        + "----------------------------------------\n"
        + "Total without taxes                  800.0\n"
        + "Discout 0%                           -0.0\n"
        + "Tax  6.85%                           +54.8\n"
        + "----------------------------------------\n"
        + "Total price                          854.8";
    //then
    assertEquals(expectResult, ticket);
  }

  @Test
  public void should_return_ticket_info_with_discount_3_when_call_printTicket_given_two_kinds_good_with_total_price_more_than_1000_in_UT() {
    //given
    List<Item> items = new ArrayList<>();
    Item apple = new Item("apple", 2, 400.0);
    items.add(apple);
    Item banana = new Item("banana", 1, 400.0);
    items.add(banana);
    CalculatePrice calculatePrice = new CalculatePrice(items, "UT");
    //when
    String ticket = calculatePrice.getTicketInfo();
    String expectResult = "apple        2        400.0        800.0\n"
        + "banana        1        400.0        400.0\n"
        + "\n"
        + "----------------------------------------\n"
        + "Total without taxes                  1200.0\n"
        + "Discout 3%                           -36.0\n"
        + "Tax  6.85%                           +82.2\n"
        + "----------------------------------------\n"
        + "Total price                          1246.2";
    //then
    assertEquals(expectResult, ticket);
  }

  @Test
  public void should_return_ticket_info_with_discount_5_when_call_printTicket_given_two_kinds_good_with_total_price_more_than_5000_in_UT() {
    //given
    List<Item> items = new ArrayList<>();
    Item apple = new Item("apple", 10, 500.0);
    items.add(apple);
    Item banana = new Item("banana", 1, 400.0);
    items.add(banana);
    CalculatePrice calculatePrice = new CalculatePrice(items, "UT");
    //when
    String ticket = calculatePrice.getTicketInfo();
    String expectResult = "apple        10        500.0        5000.0\n"
        + "banana        1        400.0        400.0\n"
        + "\n"
        + "----------------------------------------\n"
        + "Total without taxes                  5400.0\n"
        + "Discout 5%                           -270.0\n"
        + "Tax  6.85%                           +369.9\n"
        + "----------------------------------------\n"
        + "Total price                          5499.9";
    //then
    assertEquals(expectResult, ticket);
  }

  @Test
  public void should_return_ticket_info_with_discount_7_when_call_printTicket_given_two_kinds_good_with_total_price_more_than_7000_in_UT() {
    //given
    List<Item> items = new ArrayList<>();
    Item apple = new Item("apple", 10, 500.0);
    items.add(apple);
    Item banana = new Item("banana", 10, 400.0);
    items.add(banana);
    CalculatePrice calculatePrice = new CalculatePrice(items, "UT");
    //when
    String ticket = calculatePrice.getTicketInfo();
    String expectResult = "apple        10        500.0        5000.0\n"
        + "banana        10        400.0        4000.0\n"
        + "\n"
        + "----------------------------------------\n"
        + "Total without taxes                  9000.0\n"
        + "Discout 7%                           -630.0\n"
        + "Tax  6.85%                           +616.5\n"
        + "----------------------------------------\n"
        + "Total price                          8986.5";
    //then
    assertEquals(expectResult, ticket);
  }

  @Test
  public void should_return_ticket_info_with_discount_10_when_call_printTicket_given_two_kinds_good_with_total_price_more_than_10000_in_UT() {
    //given
    List<Item> items = new ArrayList<>();
    Item apple = new Item("apple", 20, 500.0);
    items.add(apple);
    Item banana = new Item("banana", 10, 400.0);
    items.add(banana);
    CalculatePrice calculatePrice = new CalculatePrice(items, "UT");
    //when
    String ticket = calculatePrice.getTicketInfo();
    String expectResult = "apple        20        500.0        10000.0\n"
        + "banana        10        400.0        4000.0\n"
        + "\n"
        + "----------------------------------------\n"
        + "Total without taxes                  14000.0\n"
        + "Discout 10%                           -1400.0\n"
        + "Tax  6.85%                           +959.0\n"
        + "----------------------------------------\n"
        + "Total price                          13559.0";
    //then
    assertEquals(expectResult, ticket);
  }

  @Test
  public void should_return_ticket_info_with_no_discount_when_call_printTicket_given_two_kinds_good_with_total_price_less_than_1000_in_NV() {
    //given
    List<Item> items = new ArrayList<>();
    Item apple = new Item("apple", 1, 400.0);
    items.add(apple);
    Item banana = new Item("banana", 1, 400.0);
    items.add(banana);
    CalculatePrice calculatePrice = new CalculatePrice(items, "NV");
    //when
    String ticket = calculatePrice.getTicketInfo();
    String expectResult = "apple        1        400.0        400.0\n"
        + "banana        1        400.0        400.0\n"
        + "\n"
        + "----------------------------------------\n"
        + "Total without taxes                  800.0\n"
        + "Discout 0%                           -0.0\n"
        + "Tax  8.00%                           +64.0\n"
        + "----------------------------------------\n"
        + "Total price                          864.0";
    //then
    assertEquals(expectResult, ticket);
  }
}