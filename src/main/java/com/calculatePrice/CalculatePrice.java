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
  private int taxNum;

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
    if (totalWithOutTaxes > 1000 && totalWithOutTaxes <=5000) {
      taxNum = 3;
    }else if(totalWithOutTaxes>5000&& totalWithOutTaxes <=7000){
      taxNum = 5;
    }else if(totalWithOutTaxes>7000&& totalWithOutTaxes <=10000){
      taxNum = 7;
    }else if(totalWithOutTaxes>10000){
      taxNum = 10;
    }
    discount += totalWithOutTaxes * taxNum / 100;
    tax = totalWithOutTaxes * 0.0685;
    total = totalWithOutTaxes - discount + tax;
    result.append("\n")
        .append("----------------------------------------\n")
        .append("Total without taxes                  ")
        .append(totalWithOutTaxes)
        .append("\n")
        .append("Discout ")
        .append(taxNum)
        .append("%                           ")
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
