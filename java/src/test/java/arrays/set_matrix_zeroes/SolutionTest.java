package arrays.set_matrix_zeroes;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testSetZeroesExample1() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    void testSetZeroesExample2() {
        Solution solution = new Solution();
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    void testSetZeroesNoZeros() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expected = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        solution.setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }
}
