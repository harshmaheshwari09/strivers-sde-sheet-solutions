# LeetCode 73: Set Matrix Zeroes

## Problem Statement

You are given an `m x n` integer matrix `matrix`.

If any cell contains `0`, you must set its entire row and entire column to `0`.

The update must be done in place, which means you should modify the given matrix directly without creating another matrix for the final answer.

## Examples

### Example 1

Input:

```text
matrix = [[1,1,1],[1,0,1],[1,1,1]]
```

Output:

```text
[[1,0,1],[0,0,0],[1,0,1]]
```

### Example 2

Input:

```text
matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
```

Output:

```text
[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
```

## Constraints

- `m == matrix.length`
- `n == matrix[0].length`
- `1 <= m, n <= 200`
- `-2^31 <= matrix[i][j] <= 2^31 - 1`

## Follow-up

An approach using extra row and column marker arrays is straightforward.
Can you solve it using constant extra space?
