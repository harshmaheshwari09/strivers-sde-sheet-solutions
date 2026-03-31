# Find Missing and Repeated Values

This directory contains the solution to the LeetCode problem [Find Missing and Repeated Values](https://leetcode.com/problems/find-missing-and-repeated-values/description/).

## Problem Description

You are given a `0`-indexed `n x n` matrix `grid` containing integers from `1` to `n^2`. Exactly one value is repeated and exactly one value is missing. Return them as `[repeated, missing]`.

## Approach

This solution uses sums and squared sums:

1. Compute the expected sum and expected squared sum for values from `1` to `n^2`.
2. Compute the actual sum and actual squared sum from the grid.
3. Derive `repeated - missing` and `repeated + missing`.
4. Solve the two equations to recover both values.

## Time Complexity

O(n^2)

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the math-based solution.
- [SolutionTest.java](../../../test/java/arrays_part_2/find_missing_and_repeated_values/SolutionTest.java): Contains JUnit 5 tests for the solution.
- [find-missing-and-repeated-values.md](find-missing-and-repeated-values.md): Problem notes and examples.
