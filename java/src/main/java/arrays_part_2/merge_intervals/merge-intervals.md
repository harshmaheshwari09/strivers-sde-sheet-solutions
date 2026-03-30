# LeetCode 56: Merge Intervals

## Problem Summary

Given a collection of intervals, merge all overlapping intervals.

## Example 1

Input:
```text
intervals = [[1,3],[2,6],[8,10],[15,18]]
```

Output:
```text
[[1,6],[8,10],[15,18]]
```

## Example 2

Input:
```text
intervals = [[1,4],[4,5]]
```

Output:
```text
[[1,5]]
```

## Notes

- Sorting by start time simplifies merging.
- Maintain the current merged interval and extend it while overlaps continue.
