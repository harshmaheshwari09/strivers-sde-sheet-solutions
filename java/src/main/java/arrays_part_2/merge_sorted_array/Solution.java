package arrays_part_2.merge_sorted_array;

/**
 * Boilerplate for LeetCode problem: Merge Sorted Array
 * Link: <a href="https://leetcode.com/problems/merge-sorted-array/description/">...</a>
 * <p>
 * Expected Time Complexity: O(m + n)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Two Pointers, Sorting
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[k--] = nums1[m--];
            } else {
                nums1[k--] = nums2[n--];
            }
        }

        while (n >= 0) {
            nums1[k--] = nums2[n--];
        }
    }
}
