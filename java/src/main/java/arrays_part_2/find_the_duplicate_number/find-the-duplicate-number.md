# LeetCode 287: Find the Duplicate Number

## Problem Summary

Given an array of length `n + 1` with values in the range `[1, n]`, return the repeated number without modifying the array and while using only constant extra space.

## Example 1

Input:
```text
nums = [1,3,4,2,2]
```

Output:
```text
2
```

## Example 2

Input:
```text
nums = [3,1,3,4,2]
```

Output:
```text
3
```

## Example 3

Input:
```text
nums = [3,3,3,3,3]
```

Output:
```text
3
```

## Notes

- There is exactly one duplicated number, but it may appear more than twice.
- Floyd's cycle detection is the usual constant-space solution.
