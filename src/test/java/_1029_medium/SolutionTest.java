package _1029_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void twoCitySchedCost() {
    final Solution solution = new Solution();
    final int result = solution.twoCitySchedCost(new int[][] {
        {10, 20}, {30, 200}, {400, 50}, {30, 20}
    });

    assertEquals(110, result);
  }
}