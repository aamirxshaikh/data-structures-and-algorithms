package org.example.arrays.remove_element;

/**
 * 27 - Remove Element
 */
public class Main {
  public static void main(String[] args) {
    int[] nums = {2, 1, 2, 2, 3, 4, 10, 2, 11, 13, 2};

    System.out.println(removeElement(nums, 2));
  }

  /**
   * Removes all occurrences of a given value from an integer array in-place.
   * Modifies the input array such that elements not equal to the value are moved to the front.
   * Returns the number of elements in the modified array not equal to the value.
   *
   * @param nums the input array
   * @param val  the value to be removed
   * @return the number of elements in the modified array not equal to the value
   */
  private static int removeElement(int[] nums, int val) {
    int j = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[j] = nums[i];
        j++;
      }
    }

    return j;
  }
}
