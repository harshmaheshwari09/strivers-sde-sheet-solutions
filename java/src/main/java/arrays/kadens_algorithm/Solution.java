package arrays.kadens_algorithm;

/**
 * Boilerplate for LeetCode problem: Maximum Subarray
 * Link: <a href="https://leetcode.com/problems/maximum-subarray/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Divide and Conquer, Dynamic Programming
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum, maxSumSoFar;
        maxSum = maxSumSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSumSoFar = Math.max(maxSumSoFar + nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxSumSoFar);
        }
        return maxSum;
    }
}
