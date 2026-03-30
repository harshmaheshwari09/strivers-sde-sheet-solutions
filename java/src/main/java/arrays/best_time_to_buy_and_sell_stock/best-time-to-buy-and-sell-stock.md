# LeetCode 121: Best Time to Buy and Sell Stock

## Problem Summary

Given an array `prices`, return the maximum profit from one buy and one sell, where the buy must happen before the sell.

## Example 1

Input:
```text
prices = [7,1,5,3,6,4]
```

Output:
```text
5
```

Explanation:
```text
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 5.
```

## Example 2

Input:
```text
prices = [7,6,4,3,1]
```

Output:
```text
0
```

Explanation:
```text
No transaction yields a positive profit.
```

## Notes

- Only one transaction is allowed.
- The optimal solution scans once while tracking the cheapest buy so far.
