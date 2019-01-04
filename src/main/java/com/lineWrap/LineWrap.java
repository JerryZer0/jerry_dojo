package com.lineWrap;

public class LineWrap {

  private String text;
  private int length;
//  private String currentText;

  public LineWrap(String text, int length) {
    this.text = text;
    this.length = length;
  }

  public String wrapLine() {
    StringBuilder space = new StringBuilder(" ");
    if (text.length() > length) {
      if (text.charAt(length) != ' ') {
        int i = length-1;
        while (text.charAt(i) != ' ') {
          space.append(" ");
          i--;
        }
        return text.substring(0, i) + space + "\n" + text.substring(i+1);
      }
      return text.substring(0, length) + "\n" + text.substring(length);
    }
    return text;
  }
}
