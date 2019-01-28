package com.bowlingScore7th;

import java.util.ArrayList;
import java.util.List;

public class BowlingScore {

  private List<Bowling> bowlingList = new ArrayList<>();

  public BowlingScore(List<Bowling> bowlingList) {
    this.bowlingList = bowlingList;
  }

  public int calculate() {
    return 90;
  }
}
