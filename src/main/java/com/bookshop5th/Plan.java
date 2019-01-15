package com.bookshop5th;

import java.util.List;

class Plan {
  private List<Integer> counts;

  Plan(List<Integer> counts) {
    this.counts = counts;
  }

  List<Integer> getCounts() {
    return counts;
  }
}
