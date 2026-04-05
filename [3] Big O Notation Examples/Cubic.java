package com.big.o.notation;

/**
 * This class demonstrates Cubic Time Complexity O(n^3).
 * It finds all sets of three numbers (triplets) that add up to a target sum.
 */
public class Cubic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 6;

        findTriplets(arr, targetSum);
    }

    /**
     * Uses three nested loops to find triplets.
     * Complexity: O(n^3)
     */
    public static void findTriplets(int[] arr, int targetSum) {
        int n = arr.length;

        // First element: runs from index 0 to n-3
        for (int i = 0; i < n - 2; i++) {

            // Second element: starts after i, runs to n-2
            for (int j = i + 1; j < n - 1; j++) {

                // Third element: starts after j, runs to n-1
                for (int k = j + 1; k < n; k++) {

                    // Check if the sum of the triplet matches the target
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        System.out.println("Triplet: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
    }
}