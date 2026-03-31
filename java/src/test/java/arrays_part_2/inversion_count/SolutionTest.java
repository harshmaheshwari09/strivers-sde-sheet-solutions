package arrays_part_2.inversion_count;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testInversionCountReverseSorted() {
        Solution solution = new Solution();

        assertEquals(6L, solution.inversionCount(new int[]{4, 3, 2, 1}));
    }

    @Test
    void testInversionCountSorted() {
        Solution solution = new Solution();

        assertEquals(0L, solution.inversionCount(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testInversionCountEqualElements() {
        Solution solution = new Solution();

        assertEquals(0L, solution.inversionCount(new int[]{10, 10, 10}));
    }

    @Test
    void testInversionCountMixedArray() {
        Solution solution = new Solution();

        assertEquals(3L, solution.inversionCount(new int[]{2, 4, 1, 3, 5}));
    }
}
