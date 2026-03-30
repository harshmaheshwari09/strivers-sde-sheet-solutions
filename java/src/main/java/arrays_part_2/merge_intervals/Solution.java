package arrays_part_2.merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Boilerplate for LeetCode problem: Merge Intervals
 * Link: <a href="https://leetcode.com/problems/merge-intervals/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n log n)
 * Expected Space Complexity: O(n)
 * <p>
 * Tags: Array, Sorting
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? Integer.compare(a[1], b[1]): Integer.compare(a[0], b[0])));
        List<int[]> result = new ArrayList<>();
        for (var interval : intervals) {
            if (result.isEmpty() || result.getLast()[1] < interval[0]) {
                result.add(interval);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[0][]);
    }
}
