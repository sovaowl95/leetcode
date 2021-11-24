package _12_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void intToRoman1() {
    final Solution solution = new Solution();
    final String result = solution.intToRoman(3);
    assertEquals("III", result);
  }

  @Test
  void intToRoman2() {
    final Solution solution = new Solution();
    final String result = solution.intToRoman(4);
    assertEquals("IV", result);
  }

  @Test
  void intToRoman3() {
    final Solution solution = new Solution();
    final String result = solution.intToRoman(9);
    assertEquals("IX", result);
  }

  @Test
  void intToRoman4() {
    final Solution solution = new Solution();
    final String result = solution.intToRoman(58);
    assertEquals("LVIII", result);
  }

  @Test
  void intToRoman5() {
    final Solution solution = new Solution();
    final String result = solution.intToRoman(1994);
    assertEquals("MCMXCIV", result);
  }

}