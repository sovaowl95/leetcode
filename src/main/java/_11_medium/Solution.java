package _11_medium;

public class Solution {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;

    int max = 0;

    while (left < right) {
      final int width = right - left;
      if (height[left] < height[right]) {
        final int minHeight = height[left];
        max = Math.max(max, width * minHeight);
        left++;
      } else {
        final int minHeight = height[left];
        max = Math.max(max, width * minHeight);
        right--;
      }
    }

    return max;
  }
}
