package arrays_part_2.find_missing_and_repeated_values;

/**
 * Boilerplate for LeetCode problem: Find Missing and Repeated Values
 * Link: <a href="https://leetcode.com/problems/find-missing-and-repeated-values/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n^2)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Matrix, Math
 */
public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = grid.length;
        long totalNumbers = n * n;
        long sumDiff = totalNumbers * (totalNumbers + 1) / 2;
        long sumSqDiff = totalNumbers * (totalNumbers + 1) * (2 * totalNumbers + 1) / 6;

        for (int[] row : grid) {
            for (int value : row) {
                sumDiff -= value;
                sumSqDiff -= (long) value * value;
            }
        }

        long repeated = (sumSqDiff / sumDiff - sumDiff) / 2;
        long missing = repeated + sumDiff;
        return new int[]{(int) repeated, (int) missing};
    }
}
