package _7_medium;

public class Solution {
  public int reverse(int x) {
    boolean positive = x >= 0;

    int res = reverseUns(Math.abs(x));
    return positive ? res : res * -1;
  }

  private int reverseUns(int abs) {
    long save = 0;
    while (abs != 0) {
      int left = abs % 10;
      save *= 10;
      save += left;
      abs = abs / 10;
    }

    if (save == (int) save) {
      return (int) save;
    } else {
      return 0;
    }
  }
}
