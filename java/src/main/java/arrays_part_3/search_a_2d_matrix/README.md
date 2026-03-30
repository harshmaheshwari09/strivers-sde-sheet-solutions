# Search a 2D Matrix

This directory contains the boilerplate for the LeetCode problem [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/description/).

## Problem Description

You are given an `m x n` integer matrix with sorted rows, where the first integer of each row is greater than the last integer of the previous row. Return `true` if the target exists in the matrix, otherwise return `false`.

## Approach

The standard approach is to treat the matrix as a sorted 1D array and run binary search across the full `m * n` range.

## Time Complexity

O(log(m * n))

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the solution boilerplate.
- [SolutionTest.java](../../../test/java/arrays_part_3/search_a_2d_matrix/SolutionTest.java): Contains JUnit 5 test boilerplate.
- [search-a-2d-matrix.md](search-a-2d-matrix.md): Problem notes and examples.
