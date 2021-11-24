package _11_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void maxArea() {
    final Solution solution = new Solution();
    final int result = solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7});
    assertEquals(49, result);
  }
}