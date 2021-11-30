package _16_medium;

import java.util.Arrays;

class Solution {
  public int threeSumClosest(int[] nums, int target) {
    int closest = 1_000_000;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      int lo = i + 1;
      int hi = nums.length - 1;

      while (lo < hi) {
        int sum = nums[i] + nums[lo] + nums[hi];
        if (sum == target) {
          return sum;
        }

        int dif = Math.abs(target - sum);
        int dif2 = Math.abs(target - closest);
        if (dif < dif2) {
          closest = sum;
        } else if (sum < target) {
          lo++;
        } else {
          hi--;
        }

      }
    }

    return closest;
  }
}
