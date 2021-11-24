package _9_easy;

class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    return x == convert(x);
  }

  private int convert(int x) {
    int save = 0;
    while (x != 0) {
      int left = x % 10;
      save = save * 10 + left;
      x = x / 10;
    }
    return save;
  }
}