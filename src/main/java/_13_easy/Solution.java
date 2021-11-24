package _13_easy;

public class Solution {
  public int romanToInt(String s) {
    int sum = 0;

    final char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      final char ch = chars[i];
      if (ch == 'I') {
        if (nextIs(chars, i, 'V', 'X')) {
          sum += chars[i + 1] == 'V' ? 4 : 9;
          i++;
        } else {
          sum += 1;
        }
      } else if (ch == 'X') {
        if (nextIs(chars, i, 'L', 'C')) {
          sum += chars[i + 1] == 'L' ? 40 : 90;
          i++;
        } else {
          sum += 10;
        }
      } else if (ch == 'C') {
        if (nextIs(chars, i, 'D', 'M')) {
          sum += chars[i + 1] == 'D' ? 400 : 900;
          i++;
        } else {
          sum += 100;
        }
      } else {
        if (ch == 'M') {
          sum += 1000;
        } else if (ch == 'D') {
          sum += 500;
        } else if (ch == 'L') {
          sum += 50;
        } else if (ch == 'V') {
          sum += 5;
        }
      }
    }

    return sum;
  }

  private boolean nextIs(char[] chars, int i, char v, char x) {
    int index = i + 1;
    if (index >= chars.length) {
      return false;
    }

    return chars[index] == v || chars[index] == x;
  }
}
