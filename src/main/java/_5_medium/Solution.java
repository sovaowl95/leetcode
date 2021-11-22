package _5_medium;

class Solution {
  public String longestPalindrome(String s) {
    final char[] chars = s.toCharArray();
    if (chars.length == 1) {
      return s;
    }

    int fromIndex = 0;
    int toIndex = 0;

    for (int i = 0; i < chars.length; i++) {
      int length = getLongestPalin(chars, i - 1, i + 1);
      if (toIndex - fromIndex < length) {
        fromIndex = i - length / 2;
        toIndex = i + length / 2;
      }

      length = getLongestPalin(chars, i, i + 1);
      if (toIndex - fromIndex < length) {
        fromIndex = i + 1 - length / 2;
        toIndex = i + length / 2;
      }
    }

    return s.substring(fromIndex, toIndex + 1);
  }

  private int getLongestPalin(char[] chars, int left, int right) {
    int count = left == right ? 1 : 0;

    while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
      count += 2;
      left--;
      right++;
    }

    return count;
  }
}