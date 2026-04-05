package com.practice.arrays;

public class Update {
    public static void main(String[] args) {
        int[] la = {1, 3, 5, 7, 8};
        int k = 3, n = 5, item = 10;
        int i;

        System.out.println("The original array elements are:");
        for (i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d \n", i, la[i]);
        }

        // Updating the element at position k (index k-1)
        la[k - 1] = item;

        System.out.println("The array elements after updation:");
        for (i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d \n", i, la[i]);
        }
    }
}