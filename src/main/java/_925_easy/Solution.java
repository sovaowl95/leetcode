package _925_easy;

class Solution {
  public boolean isLongPressedName(String name, String typed) {
    char[] c1 = name.toCharArray();
    char[] c2 = typed.toCharArray();

    if (c2.length < c1.length) {
      return false;
    }

    char save = '0';
    int i2 = 0;
    int i1 = 0;
    while (i1 < c1.length && i2 < c2.length) {
      if (c1[i1] == c2[i2]) {
        save = c1[i1];
        i1++;
        i2++;
      } else {
        while (i2 < c2.length && c2[i2] != c1[i1]) {
          if (c2[i2] == save) {
            i2++;
          } else {
            return false;
          }
        }

        save = c1[i1];
        i1++;
        i2++;
      }
    }

    if (i1 != c1.length) {
      return false;
    }
    if (i2 != c2.length) {
      for (; i2 < c2.length; i2++) {
        if (c2[i2] != save) {
          return false;
        }
      }
    }

    return true;
  }
}