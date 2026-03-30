package arrays.sort_colors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Disabled("Boilerplate scaffold until sort-colors implementation is added.")
class SolutionTest {

    @Test
    void testSortColorsExample1() {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};

        solution.sortColors(nums);

        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    void testSortColorsExample2() {
        Solution solution = new Solution();
        int[] nums = {2, 0, 1};

        solution.sortColors(nums);

        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }
}
