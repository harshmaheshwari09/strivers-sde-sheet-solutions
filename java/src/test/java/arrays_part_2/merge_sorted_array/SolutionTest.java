package arrays_part_2.merge_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testMergeExample1() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};

        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void testMergeExample2() {
        Solution solution = new Solution();
        int[] nums1 = {1};

        solution.merge(nums1, 1, new int[]{}, 0);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testMergeExample3() {
        Solution solution = new Solution();
        int[] nums1 = {0};

        solution.merge(nums1, 0, new int[]{1}, 1);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testMergeWhenNums1ValuesAreAllLarger() {
        Solution solution = new Solution();
        int[] nums1 = {4, 5, 6, 0, 0, 0};

        solution.merge(nums1, 3, new int[]{1, 2, 3}, 3);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }
}
