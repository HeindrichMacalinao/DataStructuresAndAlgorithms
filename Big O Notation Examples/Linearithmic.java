package com.big.o.notation;

import java.util.Arrays;

/**
 * Merge Sort implementation: O(n log n)
 * This algorithm divides the array into halves, sorts them recursively,
 * and then merges the sorted halves back together.
 */
public class Linearithmic {

    public static void mergeSort(int[] arr) {
        // Base case: arrays with 0 or 1 elements are already sorted
        if (arr.length <= 1) {
            return;
        }

        // Divide phase: Find the midpoint and split the array into two
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursive calls to sort the left and right halves
        mergeSort(left);
        mergeSort(right);

        // Conquer phase: Merge the two sorted halves back into the original array
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // Initial index of left sub-array
        int j = 0; // Initial index of right sub-array
        int k = 0; // Initial index of merged array

        // Compare elements from left and right arrays and copy the smaller one
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array, if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right array, if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}