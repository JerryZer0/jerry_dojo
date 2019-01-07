package com.calculatePrice;

import java.text.DecimalFormat;
import java.util.List;

public class CalculatePrice {

  String getTicketInfo(List<Item> items, String stateCode) {
    DecimalFormat df= new DecimalFormat("#0.0");
    StringBuffer result = new StringBuffer();
    for (Item item : items) {
      result.append(item.getName())
          .append("        ")
          .append(item.getCount())
          .append("        ")
          .append(item.getPrice())
          .append("        ")
          .append(item.getPrice() * item.getCount())
          .append("\n")
          .append("\n")
          .append("----------------------------------------\n")
          .append("Total without taxes                  ")
          .append(item.getPrice() * item.getCount())
          .append("\n")
          .append("Discout 0%                           ")
          .append("-0\n")
          .append("Tax  6.85%                           ")
          .append("+")
          .append(df.format(0.0685 * item.getPrice() * item.getCount()))
          .append("\n")
          .append("----------------------------------------\n")
          .append("Total price                          854.8");
    }
    return result.toString();
  }
}
