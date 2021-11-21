package _3_medium;

import java.util.HashSet;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    final HashSet<Character> set = new HashSet<>();
    final char[] chars = s.toCharArray();
    int max = 0;
    int left = 0;
    int right = 0;

    while (right < chars.length) {
      final char currentSymbol = chars[right];
      if (set.contains(currentSymbol)) {
        set.remove(chars[left]);
        left++;
      } else {
        set.add(currentSymbol);
        right++;
        max = Math.max(right - left, max);
      }
    }

    return max;
  }
}