package com.big.o.notation;
/**
 * This class demonstrates Linear Time Complexity O(n).
 * The time taken to execute increases linearly with the size of the input (n).
 */
public class Linear {
    public static void main(String[] args) {
        // Initializing an array with 5 elements
        int[] arr = {1, 2, 3, 4, 5};

        /*
         * A single loop that visits every element once is the
         * hallmark of O(n) complexity.
         */
        System.out.println("Printing array elements:");
        for (int i = 0; i < arr.length; i++) {
            // This statement executes 'n' times
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}