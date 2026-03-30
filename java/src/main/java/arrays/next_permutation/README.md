# Next Permutation

This directory contains the boilerplate for the LeetCode problem [Next Permutation](https://leetcode.com/problems/next-permutation/description/).

## Problem Description

Rearrange numbers into the lexicographically next greater permutation of numbers. If such an arrangement is not possible, rearrange them into the lowest possible order.

## Approach

The standard in-place approach is:

1. Find the first index from the right where the sequence decreases.
2. Swap it with the next larger element to its right.
3. Reverse the suffix.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the solution boilerplate.
- [SolutionTest.java](../../../test/java/arrays/next_permutation/SolutionTest.java): Contains JUnit 5 test boilerplate.
- [next-permutation.md](next-permutation.md): Problem notes and examples.
