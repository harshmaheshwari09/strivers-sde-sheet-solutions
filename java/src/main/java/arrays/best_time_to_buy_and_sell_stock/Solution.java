package arrays.best_time_to_buy_and_sell_stock;

/**
 * Boilerplate for LeetCode problem: Best Time to Buy and Sell Stock
 * Link: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Dynamic Programming
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = prices[prices.length - 1], maxProfit = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrice - prices[i]);
        }
        return maxProfit;
    }
}
