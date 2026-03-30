package arrays.next_permutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testNextPermutationExample1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};

        solution.nextPermutation(nums);

        assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    void testNextPermutationExample2() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1};

        solution.nextPermutation(nums);

        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void testNextPermutationExample3() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 5};

        solution.nextPermutation(nums);

        assertArrayEquals(new int[]{1, 5, 1}, nums);
    }

    @Test
    void testNextPermutationWithDuplicateDescendingSuffix() {
        Solution solution = new Solution();
        int[] nums = {1, 5, 1};

        solution.nextPermutation(nums);

        assertArrayEquals(new int[]{5, 1, 1}, nums);
    }
}
