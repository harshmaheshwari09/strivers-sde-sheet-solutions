# LeetCode 74: Search a 2D Matrix

## Problem Summary

Given an `m x n` matrix where:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Return `true` if `target` is present in the matrix, otherwise return `false`.

## Example 1

Input:
```text
matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
```

Output:
```text
true
```

## Example 2

Input:
```text
matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
```

Output:
```text
false
```

## Notes

- The matrix behaves like one globally sorted sequence.
- Binary search is the intended optimal approach.
