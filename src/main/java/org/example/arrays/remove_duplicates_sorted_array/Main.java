package org.example.arrays.remove_duplicates_sorted_array;

/**
 * 26 - Remove Duplicates from Sorted Array
 */
public class Main {
  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 3, 4, 8, 8, 10, 11, 13};

    System.out.println(removeDuplicatesFromSortedArray(nums));
  }

  /**
   * The removeDuplicatesFromSortedArray method removes duplicates from a sorted array of integers in-place
   * such that each unique element appears only once. The relative order of the elements is kept the same.
   *
   * @param arr The input array of integers sorted in non-decreasing order.
   * @return The number of unique elements in the modified array arr after removing duplicates.
   */
  private static int removeDuplicatesFromSortedArray(int[] arr) {
    if (arr.length == 0) return 0;

    int left = 1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        arr[left] = arr[i];

        left++;
      }
    }

    return left;
  }
}
