package com.practice.arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] LA = new int[6];
        int[] newLA = {1, 3, 5, 7, 8};
        int item = 10, k = 3, n = 5;
        int i = 0, j = n;

        // Copying elements to the larger array
        for (i = 0; i < n; i++) {
            LA[i] = newLA[i];
        }

        System.out.println("The original array elements are:");
        for (i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d \n", i, LA[i]);
        }

        // Logic for insertion
        n = n + 1;
        while (j >= k) {
            LA[j] = LA[j - 1];
            j--;
        }

        LA[k] = item;

        System.out.println("The array elements after insertion:");
        for (i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d \n", i, LA[i]);
        }
    }
}
