package com.calculatePrice;

import java.util.ArrayList;
import java.util.List;

public class Item {
  private String name;
  private int count;
  private double price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  private Item() {
    this.name = "apple";
    this.count = 1;
    this.price = 800.0;
  }

  public static List<Item> createList(int count){
    List<Item> itemList = new ArrayList<>();
    for(int i=0;i<count;i++){
      Item item = new Item();
      itemList.add(item);
    }
    return itemList;
  }
}
