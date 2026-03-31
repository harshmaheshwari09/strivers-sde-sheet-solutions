# Inversion Count

This directory contains the solution for inversion count using merge sort from [GeeksforGeeks](https://www.geeksforgeeks.org/dsa/inversion-count-in-array-using-merge-sort/).

## Problem Description

Given an integer array `arr`, count pairs `(i, j)` such that `i < j` and `arr[i] > arr[j]`.

## Approach

This solution uses merge sort:

1. Split the array into two halves.
2. Recursively count inversions in both halves.
3. During merge, count cross inversions when an element from the right half is placed before remaining elements in the left half.

## Time Complexity

O(n log n)

## Space Complexity

O(n)

## Files

- [Solution.java](Solution.java): Contains the merge-sort-based inversion counting solution.
- [SolutionTest.java](../../../test/java/arrays_part_2/inversion_count/SolutionTest.java): Contains JUnit 5 tests for the solution.
- [inversion-count.md](inversion-count.md): Notes and examples.
