package com.bookshop5th;

import java.util.ArrayList;
import java.util.List;

class Plan {
  private List<Integer> counts = new ArrayList<>();

  Plan(List<Integer> counts) {
    this.counts = counts;
  }

  List<Integer> getCounts() {
    return counts;
  }
}
