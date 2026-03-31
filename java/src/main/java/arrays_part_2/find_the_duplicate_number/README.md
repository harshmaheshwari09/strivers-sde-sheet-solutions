# Find the Duplicate Number

This directory contains the solution to the LeetCode problem [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/description/).

## Problem Description

Given an array `nums` containing `n + 1` integers where each integer is in the range `[1, n]`, return the single duplicated number.

## Approach

This solution uses Floyd's cycle detection:

1. Treat each value as a pointer to the next index.
2. Find the meeting point of slow and fast pointers.
3. Reset one pointer and move both one step at a time to find the duplicate.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the constant-space cycle detection solution.
- [SolutionTest.java](../../../test/java/arrays_part_2/find_the_duplicate_number/SolutionTest.java): Contains JUnit 5 tests for the solution.
- [find-the-duplicate-number.md](find-the-duplicate-number.md): Problem notes and examples.
