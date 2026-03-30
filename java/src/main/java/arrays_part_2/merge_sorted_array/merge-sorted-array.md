# LeetCode 88: Merge Sorted Array

## Problem Summary

Merge two sorted arrays into `nums1` in non-decreasing order, modifying `nums1` in place.

## Example 1

Input:
```text
nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
```

Output:
```text
[1,2,2,3,5,6]
```

## Example 2

Input:
```text
nums1 = [1], m = 1, nums2 = [], n = 0
```

Output:
```text
[1]
```

## Example 3

Input:
```text
nums1 = [0], m = 0, nums2 = [1], n = 1
```

Output:
```text
[1]
```

## Notes

- The extra space at the end of `nums1` is meant to hold `nums2`.
- Filling from the back avoids overwriting useful values in `nums1`.
