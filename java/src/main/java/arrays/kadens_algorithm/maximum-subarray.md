# LeetCode 53: Maximum Subarray

## Problem Summary

Given an integer array `nums`, return the largest possible sum of a contiguous non-empty subarray.

## Example 1

Input:
```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

Output:
```text
6
```

Explanation:
```text
[4,-1,2,1] has the largest sum = 6
```

## Example 2

Input:
```text
nums = [1]
```

Output:
```text
1
```

## Example 3

Input:
```text
nums = [5,4,-1,7,8]
```

Output:
```text
23
```

## Notes

- The subarray must be contiguous.
- Kadane's algorithm solves this in linear time and constant extra space.
