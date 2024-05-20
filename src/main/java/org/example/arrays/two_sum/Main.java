package org.example.arrays.two_sum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1 - two sum
 */
public class Main {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};

    System.out.println(Arrays.toString(twoSum(nums, 5)));
  }

  /**
   * Returns the indices of the two numbers in the given array whose sum is equal to the target.
   *
   * @param nums   the array of integers
   * @param target the target sum
   * @return an array of two integers representing the indices of the two numbers whose sum is equal to the target,
   * or an empty array if no such pair is found
   */
  private static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> complementMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (complementMap.containsKey(complement)) {
        return new int[]{complementMap.get(complement), i};
      }

      complementMap.put(nums[i], i);
    }

    return new int[]{};
  }
}
