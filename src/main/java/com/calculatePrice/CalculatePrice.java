package com.calculatePrice;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class CalculatePrice {

  private List<Item> items;
  private String stateCode;
  private double totalWithOutTaxes = 0;
  private double discount = 0;
  private double tax = 0;
  private double total = 0;
  private int discountRate;
  private double stateTax;
  private static final Map<String,Double> STATE_TABLE = new TreeMap<>();
  private static final Map<Integer,Integer> DISCOUNT_TABLE = new TreeMap<>();
  private static final String TAB = "        ";
  static {
    STATE_TABLE.put("UT", 0.0685);
    STATE_TABLE.put("NV", 0.08);
    STATE_TABLE.put("TX", 0.0625);
    STATE_TABLE.put("AL", 0.04);
    STATE_TABLE.put("CA", 0.0825);

    DISCOUNT_TABLE.put(1000,0);
    DISCOUNT_TABLE.put(5000,3);
    DISCOUNT_TABLE.put(7000,5);
    DISCOUNT_TABLE.put(10000,7);
    DISCOUNT_TABLE.put(50000,10);
  }

  CalculatePrice(List<Item> items, String stateCode) {
    this.items = items;
    this.stateCode = stateCode;
  }

  String getTicketInfo() {
    String result = "";
    for (Item item : items) {
      totalWithOutTaxes += item.getPrice() * item.getCount();
      result += setItemInformation(item);
    }
    discountRate = getDiscountRate();
    stateTax = STATE_TABLE.get(stateCode);
    discount += totalWithOutTaxes * discountRate / 100;
    tax = totalWithOutTaxes * stateTax;
    total = totalWithOutTaxes - discount + tax;
    result += setTotalResult();
    return result;
  }

  private String setTotalResult() {
    StringBuilder result = new StringBuilder();
    DecimalFormat df = new DecimalFormat("#0.0");
    DecimalFormat df2 = new DecimalFormat("#0.00");
    result.append("\n")
        .append("----------------------------------------\n")
        .append("Total without taxes"+TAB+TAB)
        .append(totalWithOutTaxes)
        .append("\n")
        .append("Discout ")
        .append(discountRate)
        .append("%"+TAB+TAB+TAB)
        .append("-")
        .append(discount).append("\n")
        .append("Tax  ")
        .append(df2.format(stateTax * 100))
        .append("%"+TAB+TAB+TAB)
        .append("+")
        .append(df.format(tax))
        .append("\n")
        .append("----------------------------------------\n")
        .append("Total price"+TAB+TAB+TAB)
        .append(total);
    return result.toString();
  }

  private String setItemInformation(Item item) {
    StringBuilder result = new StringBuilder();
    result.append(item.getName())
        .append(TAB)
        .append(item.getCount())
        .append(TAB)
        .append(item.getPrice())
        .append(TAB)
        .append(item.getPrice() * item.getCount())
        .append("\n");
    return result.toString();
  }

  private int getDiscountRate() {
    int currentDiscount = 15;
    for(int price:DISCOUNT_TABLE.keySet()){
      if(totalWithOutTaxes < price){
        return DISCOUNT_TABLE.get(price);
      }
    }
    return currentDiscount;
  }
}
