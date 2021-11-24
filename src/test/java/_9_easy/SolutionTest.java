package _9_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

  @Test
  void isPalindrome1() {
    final Solution solution = new Solution();
    assertTrue(solution.isPalindrome(121));
  }

  @Test
  void isPalindrome2() {
    final Solution solution = new Solution();
    assertFalse(solution.isPalindrome(-121));
  }

  @Test
  void isPalindrome3() {
    final Solution solution = new Solution();
    assertFalse(solution.isPalindrome(10));
  }

  @Test
  void isPalindrome4() {
    final Solution solution = new Solution();
    assertFalse(solution.isPalindrome(-101));
  }
}