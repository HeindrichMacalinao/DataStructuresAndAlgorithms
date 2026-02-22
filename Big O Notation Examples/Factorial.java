package com.big.o.notation;

import java.util.Arrays;

/**
 * This class demonstrates Factorial Time Complexity O(n!).
 * It generates every possible arrangement (permutation) of an array.
 * This is one of the "slowest" common complexities.
 */
public class Factorial {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("All permutations of the array:");
        permute(arr, 0, arr.length - 1);
    }

    /**
     * Recursive function to swap and permute elements.
     * Complexity: O(n * n!) - because there are n! permutations
     * and we spend O(n) time printing each one.
     */
    public static void permute(int[] arr, int start, int end) {
        if (start == end) {
            // Base case: we've reached the end of one possible arrangement
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = start; i <= end; i++) {
                swap(arr, start, i);      // Swap to create a new branch
                permute(arr, start + 1, end); // Recurse for the next position
                swap(arr, start, i);      // Backtrack: swap back to original state
            }
        }
    }

    /**
     * Helper method to swap two elements in an array.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}