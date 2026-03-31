# Inversion Count

## Problem Summary

Count the number of pairs `(i, j)` such that `i < j` and `arr[i] > arr[j]`.

## Example 1

Input:
```text
arr = [4, 3, 2, 1]
```

Output:
```text
6
```

## Example 2

Input:
```text
arr = [1, 2, 3, 4, 5]
```

Output:
```text
0
```

## Example 3

Input:
```text
arr = [10, 10, 10]
```

Output:
```text
0
```

## Notes

- Equal elements do not form inversions.
- Merge sort counts cross inversions efficiently during merging.
