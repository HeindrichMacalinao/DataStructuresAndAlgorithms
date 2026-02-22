package com.big.o.notation;
/**
 * This class demonstrates Constant Time Complexity O(1).
 * An operation is O(1) if it takes the same amount of time
 * regardless of the input size.
 */
public class Constant {
    public static void main(String[] args) {
        // Initializing a fixed-size integer array
        int[] arr = {1, 2, 3, 4, 5};

        /* * Accessing an array element by its index is an O(1) operation.
         * The computer calculates the memory address directly using:
         * Address = BaseAddress + (index * size_of_int)
         */
        int index = 2;
        int element = arr[index];

        // Output the result to the console
        System.out.println("Element at index " + index + ": " + element);
    }
}