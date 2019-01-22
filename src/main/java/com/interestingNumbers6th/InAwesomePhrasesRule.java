package com.interestingNumbers6th;

public class InAwesomePhrasesRule implements InterestingRule {

  @Override
  public boolean isInteresting(int number, int awesomePhrases[]) {
    for (int awesomePhrase : awesomePhrases) {
      if (number == awesomePhrase) {
        return true;
      }
    }
    return false;
  }
}
