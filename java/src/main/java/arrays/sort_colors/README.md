# Sort Colors

This directory contains the boilerplate for the LeetCode problem [Sort Colors](https://leetcode.com/problems/sort-colors/description/).

## Problem Description

Given an array `nums` with values `0`, `1`, and `2`, sort them in-place so that objects of the same color are adjacent, ordered as red, white, and blue.

## Approach

The standard optimal approach is the Dutch National Flag algorithm:

1. Keep three regions for `0`s, `1`s, and `2`s.
2. Scan once with pointers.
3. Swap elements into the correct region in place.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the solution boilerplate.
- [SolutionTest.java](../../../test/java/arrays/sort_colors/SolutionTest.java): Contains JUnit 5 test boilerplate.
- [sort-colors.md](sort-colors.md): Problem notes and examples.
