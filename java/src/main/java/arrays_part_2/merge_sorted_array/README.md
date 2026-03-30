# Merge Sorted Array

This directory contains the solution to the LeetCode problem [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/).

## Problem Description

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and the integers `m` and `n` representing the number of valid elements in each array. Merge `nums2` into `nums1` as one sorted array.

## Approach

This solution merges from right to left in place:

1. Start from the end of both valid ranges.
2. Place the larger value at the back of `nums1`.
3. Move the corresponding pointer backward after each placement.
4. If elements remain in `nums2`, copy them into the front of `nums1`.

## Time Complexity

O(m + n)

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the in-place merge solution.
- [SolutionTest.java](../../../test/java/arrays_part_2/merge_sorted_array/SolutionTest.java): Contains JUnit 5 tests for the solution.
- [merge-sorted-array.md](merge-sorted-array.md): Problem notes and examples.
