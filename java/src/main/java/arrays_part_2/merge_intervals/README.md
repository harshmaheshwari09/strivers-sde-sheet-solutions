# Merge Intervals

This directory contains the boilerplate for the LeetCode problem [Merge Intervals](https://leetcode.com/problems/merge-intervals/description/).

## Problem Description

Given an array of `intervals` where `intervals[i] = [start_i, end_i]`, merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

## Approach

The standard approach is to sort intervals by start time, then iterate once and merge overlapping ranges into the current interval.

## Time Complexity

O(n log n)

## Space Complexity

O(n)

## Files

- [Solution.java](Solution.java): Contains the solution boilerplate.
- [SolutionTest.java](../../../test/java/arrays_part_2/merge_intervals/SolutionTest.java): Contains JUnit 5 test boilerplate.
- [merge-intervals.md](merge-intervals.md): Problem notes and examples.
