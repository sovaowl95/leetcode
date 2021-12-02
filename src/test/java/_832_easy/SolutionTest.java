package _832_easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void flipAndInvertImage() {
    final Solution solution = new Solution();
    final int[][] result = solution.flipAndInvertImage(new int[][] {
        {1,1,0},
        {1,0,1},
        {0,0,0}
    });

    assertEquals("[[1, 0, 0], [0, 1, 0], [1, 1, 1]]", Arrays.deepToString(result));
  }
}