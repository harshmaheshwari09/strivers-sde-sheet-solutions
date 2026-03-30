# LeetCode 75: Sort Colors

## Problem Summary

Given an array with `n` objects colored red, white, or blue, sort them in place so that objects of the same color are adjacent in the order `0`, `1`, `2`.

## Example 1

Input:
```text
nums = [2,0,2,1,1,0]
```

Output:
```text
[0,0,1,1,2,2]
```

## Example 2

Input:
```text
nums = [2,0,1]
```

Output:
```text
[0,1,2]
```

## Notes

- The array should be modified in place.
- The intended optimal approach is a single-pass constant-space partition.
