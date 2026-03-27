package arrays.pascals_triangle;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testGenerateExample1() {
        Solution solution = new Solution();

        List<List<Integer>> result = solution.generate(5);

        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    void testGenerateSingleRow() {
        Solution solution = new Solution();

        List<List<Integer>> result = solution.generate(1);

        assertEquals(List.of(List.of(1)), result);
    }
}
