package _6_medium;

public class Solution {
  public String convert(String s, int numRows) {
    final char[][] field = new char[numRows][s.length()];
    boolean down = true;

    int i = 0;
    int j = 0;
    for (char c : s.toCharArray()) {
      field[i][j] = c;

      if (i == numRows - 1) {
        down = false;
        i = Math.max(0, i - 1);
        j++;
      } else if (i == 0) {
        down = true;
        i++;
      } else {
        if (down) {
          i++;
        } else {
          i = Math.max(0, i - 1);
          j++;
        }
      }
    }

    final StringBuilder sb = new StringBuilder();
    for (char[] chars : field) {
      for (char aChar : chars) {
        if (aChar != 0) {
          sb.append(aChar);
        }
      }
    }
    return sb.toString();
  }
}
