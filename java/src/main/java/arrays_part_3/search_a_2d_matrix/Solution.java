package arrays_part_3.search_a_2d_matrix;

/**
 * Boilerplate for LeetCode problem: Search a 2D Matrix
 * Link: <a href="https://leetcode.com/problems/search-a-2d-matrix/description/">...</a>
 * <p>
 * Expected Time Complexity: O(log(m * n))
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Binary Search, Matrix
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = getValue(mid, n, matrix);
            if (val == target) {
                return true;
            }
            if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    private int getValue(int idx, int cols, int[][] matrix) {
        int i = idx / cols;
        int j = idx % cols;
        return matrix[i][j];
    }
}
