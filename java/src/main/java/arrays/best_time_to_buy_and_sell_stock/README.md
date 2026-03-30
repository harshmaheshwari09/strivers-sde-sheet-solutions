# Best Time to Buy and Sell Stock

This directory contains the boilerplate for the LeetCode problem [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/).

## Problem Description

Given an array `prices` where `prices[i]` is the price of a stock on day `i`, return the maximum profit you can achieve from a single buy followed by a single sell. If no profit is possible, return `0`.

## Approach

The standard optimal approach is:

1. Track the minimum price seen so far.
2. For each day, compute the profit from selling on that day.
3. Keep the maximum profit seen.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Files

- [Solution.java](Solution.java): Contains the solution boilerplate.
- [SolutionTest.java](../../../test/java/arrays/best_time_to_buy_and_sell_stock/SolutionTest.java): Contains JUnit 5 test boilerplate.
- [best-time-to-buy-and-sell-stock.md](best-time-to-buy-and-sell-stock.md): Problem notes and examples.
