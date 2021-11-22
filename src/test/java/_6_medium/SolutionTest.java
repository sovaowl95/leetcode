package _6_medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
  Solution solution;

  @BeforeEach
  void init() {
    solution = new Solution();
  }

  @Test
  void convert1() {
    final String result = solution.convert("PAYPALISHIRING", 3);
    Assertions.assertEquals("PAHNAPLSIIGYIR", result);
  }

  @Test
  void convert2() {
    final String result = solution.convert("PAYPALISHIRING", 4);
    Assertions.assertEquals("PINALSIGYAHRPI", result);
  }

  @Test
  void convert3() {
    final String result = solution.convert("A", 1);
    Assertions.assertEquals("A", result);
  }

  @Test
  void convert4() {
    final String result = solution.convert("AB", 1);
    Assertions.assertEquals("A", result);
  }
}