package arrays.kadens_algorithm;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Boilerplate scaffold until maximum-subarray implementation is added.")
class SolutionTest {

    @Test
    void testMaxSubArrayExample1() {
        Solution solution = new Solution();

        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void testMaxSubArrayExample2() {
        Solution solution = new Solution();

        assertEquals(1, solution.maxSubArray(new int[]{1}));
    }

    @Test
    void testMaxSubArrayExample3() {
        Solution solution = new Solution();

        assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
