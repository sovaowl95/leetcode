package _3_medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
  Solution solution;

  @BeforeEach
  void init() {
    solution = new Solution();
  }

  @Test
  void lengthOfLongestSubstring1() {
    String s = "abcabcbb";
    final int i = solution.lengthOfLongestSubstring(s);

    Assertions.assertEquals(3, i);
  }

  @Test
  void lengthOfLongestSubstring2() {
    String s = "bbbbb";
    final int i = solution.lengthOfLongestSubstring(s);

    Assertions.assertEquals(1, i);
  }

  @Test
  void lengthOfLongestSubstring3() {
    String s = "pwwkew";
    final int i = solution.lengthOfLongestSubstring(s);

    Assertions.assertEquals(3, i);
  }

  @Test
  void lengthOfLongestSubstring4() {
    String s = "";
    final int i = solution.lengthOfLongestSubstring(s);

    Assertions.assertEquals(0, i);
  }
}