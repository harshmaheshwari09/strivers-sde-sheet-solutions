package arrays_part_2.find_the_duplicate_number;

/**
 * Boilerplate for LeetCode problem: Find the Duplicate Number
 * Link: <a href="https://leetcode.com/problems/find-the-duplicate-number/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Two Pointers, Binary Search, Bit Manipulation
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int finder = nums[0];
        while (finder != slow) {
            finder = nums[finder];
            slow = nums[slow];
        }

        return finder;
    }
}
