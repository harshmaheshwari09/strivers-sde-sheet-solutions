package arrays_part_2.find_missing_and_repeated_values;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testFindMissingAndRepeatedValuesExample1() {
        Solution solution = new Solution();
        int[][] grid = {
                {1, 3},
                {2, 2}
        };

        assertArrayEquals(new int[]{2, 4}, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    void testFindMissingAndRepeatedValuesExample2() {
        Solution solution = new Solution();
        int[][] grid = {
                {9, 1, 7},
                {8, 9, 2},
                {3, 4, 6}
        };

        assertArrayEquals(new int[]{9, 5}, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    void testFindMissingAndRepeatedValuesSmallestGrid() {
        Solution solution = new Solution();
        int[][] grid = {
                {1, 1},
                {3, 4}
        };

        assertArrayEquals(new int[]{1, 2}, solution.findMissingAndRepeatedValues(grid));
    }
}
