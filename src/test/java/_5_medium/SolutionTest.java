package _5_medium;

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
  void longestPalindrome() {
    final String result = solution.longestPalindrome("babad");
    Assertions.assertEquals("aba", result);
  }

  @Test
  void longestPalindrome2() {
    final String result = solution.longestPalindrome("cbbd");
    Assertions.assertEquals("bb", result);
  }

  @Test
  void longestPalindrome3() {
    final String result = solution.longestPalindrome("a");
    Assertions.assertEquals("a", result);
  }

  @Test
  void longestPalindrome4() {
    final String result = solution.longestPalindrome("ac");
    Assertions.assertEquals("a", result);
  }

  @Test
  void longestPalindrome5() {
    final String result = solution.longestPalindrome("bb");
    Assertions.assertEquals("bb", result);
  }
}