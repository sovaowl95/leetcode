package _14_easy;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    int toIndex = 0;
    final String firstString = strs[0];
    boolean isEnd = false;

    while (toIndex < firstString.length() && !isEnd) {
      char ch = firstString.charAt(toIndex);
      for (String str : strs) {
        if (toIndex >= str.length() || str.charAt(toIndex) != ch) {
          isEnd = true;
          break;
        }
      }

      if (!isEnd) {
        toIndex++;
      }
    }

    return firstString.substring(0, toIndex);
  }
}
