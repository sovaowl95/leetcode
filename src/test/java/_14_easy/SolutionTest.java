package _14_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void longestCommonPrefix1() {
    final Solution solution = new Solution();
    final String result = solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"});
    assertEquals("fl", result);
  }

  @Test
  void longestCommonPrefix2() {
    final Solution solution = new Solution();
    final String result = solution.longestCommonPrefix(new String[] {"dog","racecar","car"});
    assertEquals("", result);
  }
}