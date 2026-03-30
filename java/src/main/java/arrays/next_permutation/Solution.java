package arrays.next_permutation;

/**
 * Boilerplate for LeetCode problem: Next Permutation
 * Link: <a href="https://leetcode.com/problems/next-permutation/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Two Pointers
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int left = nums.length - 2;
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }

        if (left >= 0) {
            int right = nums.length - 1;
            while (nums[right] <= nums[left]) {
                right--;
            }
            swap(nums, left, right);
        }
        reverse(nums, left + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
