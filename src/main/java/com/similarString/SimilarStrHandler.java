package com.similarString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimilarStrHandler {

  private final int DIFFERENT_POSITIONS_SUM = 2;
  private String originalStr;
  private String targetedStr;

  public SimilarStrHandler(String originalStr, String targetedStr) {
    this.originalStr = originalStr;
    this.targetedStr = targetedStr;
  }

  public boolean compareSimilar() {
    if (originalStr.length() != targetedStr.length()) {
      return false;
    }
    if (originalStr.equals(targetedStr)) {
      return isUniqueStr();
    }
    List<Integer> indexList = getDifferentPositions();
    if (indexList.size() != DIFFERENT_POSITIONS_SUM) {
      return false;
    }
    return isSimilar(indexList);
  }

  private boolean isUniqueStr() {
    Set<Character> charSet = new HashSet<>();
    for (char c : originalStr.toCharArray()) {
      charSet.add(c);
    }
    return charSet.size() != originalStr.length();
  }

  private List<Integer> getDifferentPositions() {
    List<Integer> indexList = new ArrayList<>();
    int length = originalStr.length();
    for (int i = 0; i < length; i++) {
      if (targetedStr.charAt(i) != originalStr.charAt(i)) {
        indexList.add(i);
      }
      if (indexList.size() > DIFFERENT_POSITIONS_SUM) {
        return indexList;
      }
    }
    return indexList;
  }

  private boolean isSimilar(List<Integer> indexList) {
    return originalStr.charAt(indexList.get(1)) == targetedStr.charAt(indexList.get(0))
        && originalStr.charAt(indexList.get(0)) == targetedStr.charAt(indexList.get(1));
  }
}
