package arrays.sort_colors;

/**
 * Boilerplate for LeetCode problem: Sort Colors
 * Link: <a href="https://leetcode.com/problems/sort-colors/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Two Pointers, Sorting
 */
public class Solution {
    public void sortColors(int[] nums) {
        int zeroPtr = 0, onePtr = 0, twoPtr = nums.length - 1;
        while (onePtr <= twoPtr) {
            if (nums[onePtr] == 0) {
                swap(nums, zeroPtr++, onePtr++);
            } else if (nums[onePtr] == 2) {
                swap(nums, onePtr, twoPtr--);
            } else {
                onePtr++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
