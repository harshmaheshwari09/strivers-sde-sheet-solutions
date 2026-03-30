package arrays_part_2.merge_intervals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Disabled("Boilerplate scaffold until merge-intervals implementation is added.")
class SolutionTest {

    @Test
    void testMergeExample1() {
        Solution solution = new Solution();
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] expected = {
                {1, 6},
                {8, 10},
                {15, 18}
        };

        assertArrayEquals(expected, solution.merge(intervals));
    }

    @Test
    void testMergeExample2() {
        Solution solution = new Solution();
        int[][] intervals = {
                {1, 4},
                {4, 5}
        };

        int[][] expected = {
                {1, 5}
        };

        assertArrayEquals(expected, solution.merge(intervals));
    }
}
