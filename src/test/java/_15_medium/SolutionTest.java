package _15_medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void threeSum1() {
    final Solution solution = new Solution();
    final List<List<Integer>> result = solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
    assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), result);
  }


  @Test
  void threeSum2() {
    final Solution solution = new Solution();
    final List<List<Integer>> result = solution.threeSum(new int[] {});
    assertEquals(List.of(), result);
  }

  @Test
  void threeSum3() {
    final Solution solution = new Solution();
    final List<List<Integer>> result = solution.threeSum(new int[] {0});
    assertEquals(List.of(), result);
  }
}