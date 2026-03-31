package arrays_part_2.inversion_count;

/**
 * Boilerplate for inversion count using merge sort.
 * Reference: <a href="https://www.geeksforgeeks.org/dsa/inversion-count-in-array-using-merge-sort/">...</a>
 * <p>
 * Expected Time Complexity: O(n log n)
 * Expected Space Complexity: O(n)
 * <p>
 * Tags: Array, Divide and Conquer, Merge Sort
 */
public class Solution {
    public long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private long mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return 0L;
        }

        int mid = l + (r - l) / 2;
        return mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r) + merge(arr, l, mid, mid + 1, r);
    }

    private long merge(int[] arr, int l1, int r1, int l2, int r2) {
        int[] left = new int[r1 - l1 + 1];
        for (int i = l1; i <= r1; i++) {
            left[i - l1] = arr[i];
        }

        int[] right = new int[r2 - l2 + 1];
        for (int i = l2; i <= r2; i++) {
            right[i - l2] = arr[i];
        }

        long inversionCount = 0;
        int leftPtr = 0, rightPtr = 0;
        while (leftPtr < left.length && rightPtr < right.length) {
            if (left[leftPtr] <= right[rightPtr]) {
                arr[l1++] = left[leftPtr++];
            } else {
                arr[l1++] = right[rightPtr++];
                inversionCount += left.length - leftPtr;
            }
        }
        while (leftPtr < left.length) {
            arr[l1++] = left[leftPtr++];
        }
        while (rightPtr < right.length) {
            arr[l1++] = right[rightPtr++];
        }
        return inversionCount;
    }
}
