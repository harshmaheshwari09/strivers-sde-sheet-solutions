# Kaden's Algorithm

This directory contains the boilerplate for the LeetCode problem [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/).

## Problem Description

Given an integer array `nums`, find the contiguous subarray with the largest sum and return that sum.

## Approach

The standard optimal approach is Kadane's algorithm:

1. Track the best subarray ending at the current index.
2. Track the overall best sum seen so far.
3. Update both in one pass through the array.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the solution boilerplate.
- [SolutionTest.java](../../../test/java/arrays/kadens_algorithm/SolutionTest.java): Contains JUnit 5 test boilerplate.
- [maximum-subarray.md](maximum-subarray.md): Problem notes and examples.
