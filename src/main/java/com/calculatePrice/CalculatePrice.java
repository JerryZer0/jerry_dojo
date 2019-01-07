package com.calculatePrice;

import java.text.DecimalFormat;
import java.util.List;

class CalculatePrice {

  private List<Item> items;
  private String stateCode;
  private double totalWithOutTaxes = 0;
  private double discount = 0;
  private double tax = 0;
  private double total = 0;

  public CalculatePrice(List<Item> items, String stateCode) {
    this.items = items;
    this.stateCode = stateCode;
  }

  String getTicketInfo() {
    DecimalFormat df = new DecimalFormat("#0.0");
    StringBuilder result = new StringBuilder();
    for (Item item : items) {
      totalWithOutTaxes += item.getPrice() * item.getCount();
      result.append(item.getName())
          .append("        ")
          .append(item.getCount())
          .append("        ")
          .append(item.getPrice())
          .append("        ")
          .append(item.getPrice() * item.getCount())
          .append("\n");
    }
    if(totalWithOutTaxes>1000){
      discount += totalWithOutTaxes * 0.03;
    }
    tax = totalWithOutTaxes * 0.0685;
    total = totalWithOutTaxes - discount + tax;
    result.append("\n")
        .append("----------------------------------------\n")
        .append("Total without taxes                  ")
        .append(totalWithOutTaxes)
        .append("\n")
        .append("Discout 0%                           ")
        .append("-" + discount + "\n")
        .append("Tax  6.85%                           ")
        .append("+")
        .append(df.format(tax))
        .append("\n")
        .append("----------------------------------------\n")
        .append("Total price                          ")
        .append(total);
    return result.toString();
  }
}
