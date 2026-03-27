# Set Matrix Zeroes

This directory contains the solution to the LeetCode problem [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/description/).

## Problem Description

Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.

## Approach

We use the first row and first column of the matrix as markers to indicate which rows and columns need to be zeroed out. This allows us to solve the problem in O(1) extra space.

1. Check if the first row and first column originally contain any zeros.
2. Iterate through the matrix (excluding first row and column) and use the first row and column to mark which rows/columns have zeros.
3. Zero out the marked rows and columns.
4. Finally, zero out the first row and column if they originally had zeros.

## Time Complexity

O(m * n) where m is the number of rows and n is the number of columns.

## Space Complexity

O(1) extra space (excluding the input matrix).

## Files

- [Solution.java](Solution.java): Contains the main solution implementation.
- [SolutionTest.java](../../../test/array/set_matrix_zeroes/SolutionTest.java): Contains test cases to verify the solution.
- [set-matrix-zeroes.md](set-matrix-zeroes.md): Detailed problem description.
