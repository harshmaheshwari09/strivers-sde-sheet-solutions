package arrays_part_3.search_a_2d_matrix;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled("Boilerplate scaffold until search-a-2d-matrix implementation is added.")
class SolutionTest {

    @Test
    void testSearchMatrixTargetPresent() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        assertTrue(solution.searchMatrix(matrix, 3));
    }

    @Test
    void testSearchMatrixTargetAbsent() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        assertFalse(solution.searchMatrix(matrix, 13));
    }
}
