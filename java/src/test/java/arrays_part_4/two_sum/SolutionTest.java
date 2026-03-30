package arrays_part_4.two_sum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Disabled("Boilerplate scaffold until two-sum implementation is added.")
class SolutionTest {

    @Test
    void testTwoSumExample1() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testTwoSumExample2() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void testTwoSumExample3() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
    }
}
