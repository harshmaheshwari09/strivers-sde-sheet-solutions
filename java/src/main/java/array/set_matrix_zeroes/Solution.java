package array.set_matrix_zeroes;

import java.util.Arrays;

/**
 * Solution for LeetCode problem: Set Matrix Zeroes
 * Link: <a href="https://leetcode.com/problems/set-matrix-zeroes/description/">...</a>
 * <p>
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 * <p>
 * Tags: Array, Hash Table, Matrix
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean clearFirstRow = false;
        boolean clearFirstCol = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i > 0 && j > 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                    if (i == 0) {
                        clearFirstRow = true;
                    }
                    if (j == 0) {
                        clearFirstCol = true;
                    }
                }
            }
        }

        // setting rows to zero
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                Arrays.fill(matrix[i], 0);
            }
        }

        // setting columns to zero
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (clearFirstRow) {
            Arrays.fill(matrix[0], 0);
        }

        if (clearFirstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
