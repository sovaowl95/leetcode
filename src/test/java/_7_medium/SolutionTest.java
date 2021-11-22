package _7_medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @ParameterizedTest
  @CsvSource(value = {
      "123, 321",
      "-123, -321",
      "120, 21",
      "0, 0",
  })
  void reverse1(int num, int expected) {
    final Solution solution = new Solution();
    final int reverse = solution.reverse(num);
    assertEquals(expected, reverse);
  }
}