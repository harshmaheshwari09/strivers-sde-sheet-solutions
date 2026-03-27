package arrays.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for LeetCode problem: Pascal's Triangle
 * Link: <a href="https://leetcode.com/problems/pascals-triangle/description/">...</a>
 * <p>
 * Time Complexity: O(numRows^2)
 * Space Complexity: O(numRows^2)
 * <p>
 * Tags: Array, Dynamic Programming
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) {
            return triangle;
        }

        triangle.add(List.of(1));
        for (int i = 2; i <= numRows; i++) {
            List<Integer> prevRow = triangle.get(triangle.size() - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j = 0; j < prevRow.size() - 1; j++) {
                currRow.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }
}
