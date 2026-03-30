package arrays.best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Boilerplate scaffold until best-time-to-buy-and-sell-stock implementation is added.")
class SolutionTest {

    @Test
    void testMaxProfitExample1() {
        Solution solution = new Solution();

        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void testMaxProfitExample2() {
        Solution solution = new Solution();

        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
