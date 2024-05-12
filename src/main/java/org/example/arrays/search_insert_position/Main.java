package org.example.arrays.search_insert_position;

/**
 * 35 - search-insert-position
 */
public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7};

    System.out.println(searchInsert(arr, 4));
  }

  /**
   * Searches for the position where the target value should be inserted in a sorted array.
   * <p>
   * This method uses the binary search algorithm to find the index where the target value
   * should be inserted in a sorted array, such that the array remains sorted after the
   * insertion.
   * <p>
   * If the target value is present in the array, the method returns its index. Otherwise,
   * it returns the index where the target value should be inserted to maintain the sorted
   * order of the array.
   *
   * @param nums   the sorted array to search
   * @param target the value to search for or insert
   * @return the index where the target value should be inserted in the sorted array
   * @implNote This method uses the binary search algorithm with a time complexity of O(log n),
   * where n is the length of the input array.
   */
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
