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
  private double stateTax;

  CalculatePrice(List<Item> items, String stateCode) {
    this.items = items;
    this.stateCode = stateCode;
  }

  String getTicketInfo() {
    DecimalFormat df = new DecimalFormat("#0.0");
    DecimalFormat df2 = new DecimalFormat("#0.00");
    StringBuilder result = new StringBuilder();
    for (Item item : items) {
      totalWithOutTaxes += item.getPrice() * item.getCount();
      setItemInfomation(result, item);
    }
    setTaxNum();
    setStateCode();
    discount += totalWithOutTaxes * taxNum / 100;
    tax = totalWithOutTaxes * stateTax;
    total = totalWithOutTaxes - discount + tax;
    setTotalResult(df, df2, result);
    return result.toString();
  }

  private void setTotalResult(DecimalFormat df, DecimalFormat df2, StringBuilder result) {
    result.append("\n")
        .append("----------------------------------------\n")
        .append("Total without taxes                  ")
        .append(totalWithOutTaxes)
        .append("\n")
        .append("Discout ")
        .append(taxNum)
        .append("%                           ")
        .append("-")
        .append(discount).append("\n")
        .append("Tax  ")
        .append(df2.format(stateTax * 100))
        .append("%                           ")
        .append("+")
        .append(df.format(tax))
        .append("\n")
        .append("----------------------------------------\n")
        .append("Total price                          ")
        .append(total);
  }

  private void setItemInfomation(StringBuilder result, Item item) {
    result.append(item.getName())
        .append("        ")
        .append(item.getCount())
        .append("        ")
        .append(item.getPrice())
        .append("        ")
        .append(item.getPrice() * item.getCount())
        .append("\n");
  }

  private void setTaxNum() {
    if (totalWithOutTaxes > 1000 && totalWithOutTaxes <= 5000) {
      taxNum = 3;
    } else if (totalWithOutTaxes > 5000 && totalWithOutTaxes <= 7000) {
      taxNum = 5;
    } else if (totalWithOutTaxes > 7000 && totalWithOutTaxes <= 10000) {
      taxNum = 7;
    } else if (totalWithOutTaxes > 10000 && totalWithOutTaxes <= 50000) {
      taxNum = 10;
    } else if (totalWithOutTaxes > 50000) {
      taxNum = 15;
    }
  }

  private void setStateCode() {
    switch (stateCode) {
      case "UT":
        stateTax = 0.0685;
        break;
      case "NV":
        stateTax = 0.08;
        break;
      case "TX":
        stateTax = 0.0625;
        break;
      case "AL":
        stateTax = 0.04;
        break;
      case "CA":
        stateTax = 0.0825;
        break;
      default:
        break;
    }
  }
}
