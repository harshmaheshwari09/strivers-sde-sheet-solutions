# Pascal's Triangle

This directory contains the solution to the LeetCode problem [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/description/).

## Problem Description

Given an integer `numRows`, return the first `numRows` of Pascal's triangle.

## Approach

Build the triangle row by row. Each row starts and ends with `1`, and every inner value is the sum of the two values directly above it from the previous row.

## Time Complexity

O(numRows^2)

## Space Complexity

O(numRows^2)

## Files

- [Solution.java](Solution.java): Contains the main solution implementation.
- [SolutionTest.java](../../../test/java/arrays/pascals_triangle/SolutionTest.java): Contains test cases to verify the solution.
- [pascals-triangle.md](pascals-triangle.md): Problem notes and examples.
