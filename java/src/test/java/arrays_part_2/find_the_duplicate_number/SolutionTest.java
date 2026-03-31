package arrays_part_2.find_the_duplicate_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testFindDuplicateExample1() {
        Solution solution = new Solution();

        assertEquals(2, solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    @Test
    void testFindDuplicateExample2() {
        Solution solution = new Solution();

        assertEquals(3, solution.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }

    @Test
    void testFindDuplicateExample3() {
        Solution solution = new Solution();

        assertEquals(3, solution.findDuplicate(new int[]{3, 3, 3, 3, 3}));
    }
}
