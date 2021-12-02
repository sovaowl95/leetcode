package _1051_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void heightChecker() {
    final Solution solution = new Solution();
    final int result = solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3});
    assertEquals(3, result);
  }
}