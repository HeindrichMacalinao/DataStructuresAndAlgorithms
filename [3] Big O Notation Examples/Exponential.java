package com.big.o.notation;

/**
 * This class demonstrates Exponential Time Complexity O(2^n).
 * In this case, adding just one to 'n' doubles the work required.
 */
public class Exponential {
    public static void main(String[] args) {
        int n = 6; // Warning: Increasing this value above 40-50 will be extremely slow
        System.out.println("Calculating Fibonacci for: " + n);

        int result = calculateFibonacci(n);

        System.out.println("Result: " + result);
    }

    /**
     * Recursive method to find the nth Fibonacci number.
     * Each call creates TWO more calls, leading to a tree that doubles in size.
     */
    public static int calculateFibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        /* * The branching factor (2) raised to the depth of the tree (n)
         * gives us the complexity O(2^n).
         */
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}