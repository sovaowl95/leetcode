package _925_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void isLongPressedName() {
    final Solution solution = new Solution();
    final boolean longPressedName = solution.isLongPressedName("alex", "aaleex");
    assertEquals(true, longPressedName);
  }

  @Test
  void isLongPressedName2() {
    final Solution solution = new Solution();
    final boolean longPressedName = solution.isLongPressedName("saeed", "ssaaedd");
    assertEquals(false, longPressedName);
  }


  @Test
  void isLongPressedName3() {
    final Solution solution = new Solution();
    final boolean longPressedName = solution.isLongPressedName("leelee", "lleeelee");
    assertEquals(true, longPressedName);
  }

  @Test
  void isLongPressedName4() {
    final Solution solution = new Solution();
    final boolean longPressedName = solution.isLongPressedName("laiden", "laiden");
    assertEquals(true, longPressedName);
  }

  @Test
  void isLongPressedName5() {
    final Solution solution = new Solution();
    final boolean longPressedName = solution.isLongPressedName("vtkgn", "vttkgnn");
    assertEquals(true, longPressedName);
  }
}