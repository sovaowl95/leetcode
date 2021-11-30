package _15_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    final Set<List<Integer>> result = new HashSet<>();

    for (int i = 0; i < nums.length - 2; i++) {
      if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int target = -nums[i];
      for (int j = i + 1; j < nums.length - 1; j++) {
        int target2 = target - nums[j];
        final int k = Arrays.binarySearch(nums, j + 1, nums.length, target2);
        if (k > 0) {
          result.add(List.of(nums[i], nums[j], nums[k]));
        }
      }
    }

    return new ArrayList(result);
  }
}