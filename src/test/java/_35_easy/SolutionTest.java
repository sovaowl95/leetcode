package _35_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void searchInsert1() {
    final Solution solution = new Solution();
    final int result = solution.searchInsert(new int[] {1,3,5,6}, 5);
    assertEquals(2, result);
  }

  @Test
  void searchInsert2() {
    final Solution solution = new Solution();
    final int result = solution.searchInsert(new int[] {1,3,5,6}, 2);
    assertEquals(1, result);
  }

  @Test
  void searchInsert3() {
    final Solution solution = new Solution();
    final int result = solution.searchInsert(new int[] {1,3,5,6}, 7);
    assertEquals(4, result);
  }

  @Test
  void searchInsert4() {
    final Solution solution = new Solution();
    final int result = solution.searchInsert(new int[] {1,3,5,6}, 0);
    assertEquals(0, result);
  }

  @Test
  void searchInsert5() {
    final Solution solution = new Solution();
    final int result = solution.searchInsert(new int[] {1}, 0);
    assertEquals(0, result);
  }
}