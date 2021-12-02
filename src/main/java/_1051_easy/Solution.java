package _1051_easy;

class Solution {
  public int heightChecker(int[] heights) {
    int[] mem = new int[101];

    for (int h : heights) {
      mem[h]++;
    }


    int result = 0;
    int memIndex = 0;

    for (int i = 0; i < heights.length; ) {
      while (mem[memIndex] == 0) {
        memIndex++;
      }

      int stepCounter = 0;
      while (stepCounter < mem[memIndex]) {
        if (heights[i] != memIndex) {
          result++;
        }

        i++;
        stepCounter++;
      }

      memIndex++;
    }

    return result;

  }
}