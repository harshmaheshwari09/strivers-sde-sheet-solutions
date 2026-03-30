# LeetCode 31: Next Permutation

## Problem Summary

Transform the given integer array into its next lexicographically greater permutation in place. If no greater permutation exists, transform it into ascending order.

## Example 1

Input:
```text
nums = [1,2,3]
```

Output:
```text
[1,3,2]
```

## Example 2

Input:
```text
nums = [3,2,1]
```

Output:
```text
[1,2,3]
```

## Example 3

Input:
```text
nums = [1,1,5]
```

Output:
```text
[1,5,1]
```

## Notes

- The transformation must happen in place.
- Reverse the suffix after swapping with the pivot.
