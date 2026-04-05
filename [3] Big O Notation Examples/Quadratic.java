package com.big.o.notation;

import java.util.Arrays;

/**
 * This class demonstrates Quadratic Time Complexity O(n^2).
 * The time taken grows proportionally to the square of the input size.
 * Common in algorithms involving nested iterations over the same data.
 */
public class Quadratic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Outer loop: Runs 'n' times
        for (int i = 0; i < arr.length; i++) {

            // Inner loop: Also runs 'n' times for EVERY iteration of the outer loop
            for (int j = 0; j < arr.length; j++) {
                // Total executions = n * n
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}