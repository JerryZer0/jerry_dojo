package com.bookshop5th;

public class BookList {
  private int firstCopy;
  private int secondCopy;
  private int thirdCopy;
  private int fourthCopy;
  private int fifthCopy;

  public BookList(int firstCopy, int secondCopy, int thirdCopy, int fourthCopy, int fifthCopy) {
    this.firstCopy = firstCopy;
    this.secondCopy = secondCopy;
    this.thirdCopy = thirdCopy;
    this.fourthCopy = fourthCopy;
    this.fifthCopy = fifthCopy;
  }

  public int getFirstCopy() {
    return firstCopy;
  }

  public void setFirstCopy(int firstCopy) {
    this.firstCopy = firstCopy;
  }

  public int getSecondCopy() {
    return secondCopy;
  }

  public void setSecondCopy(int secondCopy) {
    this.secondCopy = secondCopy;
  }

  public int getThirdCopy() {
    return thirdCopy;
  }

  public void setThirdCopy(int thirdCopy) {
    this.thirdCopy = thirdCopy;
  }

  public int getFourthCopy() {
    return fourthCopy;
  }

  public void setFourthCopy(int fourthCopy) {
    this.fourthCopy = fourthCopy;
  }

  public int getFifthCopy() {
    return fifthCopy;
  }

  public void setFifthCopy(int fifthCopy) {
    this.fifthCopy = fifthCopy;
  }
}
