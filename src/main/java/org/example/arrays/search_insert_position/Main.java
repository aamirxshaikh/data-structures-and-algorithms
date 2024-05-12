package org.example.arrays.search_insert_position;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7};

    System.out.println(searchInsert(arr, 4));
  }

  private static int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target == nums[mid]) {
        return mid;
      } else if (target < nums[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return start;
  }
}
