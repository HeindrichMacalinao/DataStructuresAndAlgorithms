package com.practice.arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] la = {1, 3, 5, 7, 8};
        int k = 3; // Index to delete from
        int n = 5; // Current number of elements
        int i, j;

        System.out.println("The original array elements are:");
        for (i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d \n", i, la[i]);
        }

        // Logic for Deletion: Shifting elements to the left
        j = k;
        while (j < n) {
            la[j - 1] = la[j];
            j = j + 1;
        }
        n = n - 1; // Reduce the logical size of the array

        System.out.println("The array elements after deletion:");
        for (i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d \n", i, la[i]);
        }
    }
}
