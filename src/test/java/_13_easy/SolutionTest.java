package _13_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void romanToInt1() {
    final Solution solution = new Solution();
    final int result = solution.romanToInt("III");
    assertEquals(3, result);
  }

  @Test
  void romanToInt2() {
    final Solution solution = new Solution();
    final int result = solution.romanToInt("IV");
    assertEquals(4, result);
  }

  @Test
  void romanToInt3() {
    final Solution solution = new Solution();
    final int result = solution.romanToInt("IX");
    assertEquals(9, result);
  }

  @Test
  void romanToInt4() {
    final Solution solution = new Solution();
    final int result = solution.romanToInt("LVIII");
    assertEquals(58, result);
  }

  @Test
  void romanToInt5() {
    final Solution solution = new Solution();
    final int result = solution.romanToInt("MCMXCIV");
    assertEquals(1994, result);
  }
}