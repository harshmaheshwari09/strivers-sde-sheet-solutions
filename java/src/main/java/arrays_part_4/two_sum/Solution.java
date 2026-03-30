package arrays_part_4.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * Boilerplate for LeetCode problem: Two Sum
 * Link: <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Space Complexity: O(n)
 * <p>
 * Tags: Array, Hash Table
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexTable.containsKey(nums[i])) {
                return new int[]{indexTable.get(nums[i]), i};
            }
            indexTable.put(target - nums[i], i);
        }
        return new int[0];
    }
}
