# LeetCode 48: Rotate Image

## Problem Summary

Rotate the given `n x n` matrix by 90 degrees clockwise, in place.

## Example 1

Input:
```text
[[1,2,3],
 [4,5,6],
 [7,8,9]]
```

Output:
```text
[[7,4,1],
 [8,5,2],
 [9,6,3]]
```

## Example 2

Input:
```text
[[5,1,9,11],
 [2,4,8,10],
 [13,3,6,7],
 [15,14,12,16]]
```

Output:
```text
[[15,13,2,5],
 [14,3,4,1],
 [12,6,8,9],
 [16,7,10,11]]
```

## Notes

- The matrix must be modified in place.
- A common solution is transpose + reverse each row.
