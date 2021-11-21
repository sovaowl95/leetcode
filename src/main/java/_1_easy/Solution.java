package _1_easy;

import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    final HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final int currentValue = nums[i];
      int tempTarget = target - currentValue;
      if (map.containsKey(tempTarget)) {
        return new int[] {map.get(tempTarget), i};
      } else {
        map.put(currentValue, i);
      }
    }

    return new int[0];
  }
}