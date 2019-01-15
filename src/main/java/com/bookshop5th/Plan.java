package com.bookshop5th;

import java.util.ArrayList;
import java.util.List;

public class Plan {
  private List<Integer> plan = new ArrayList<>();

  public Plan(List<Integer> plan) {
    this.plan = plan;
  }

  public List<Integer> getPlan() {
    return plan;
  }
}
