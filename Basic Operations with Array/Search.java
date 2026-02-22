package com.practice.arrays;

public class Search {
    public static void main(String[] args) {
        int[] la = {1, 3, 5, 7, 8};
        int item = 5, n = 5;
        int i = 0, j = 0;

        System.out.println("The original array elements are:");
        for (i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d \n", i, la[i]);
        }

        // Linear Search logic
        while (j < n) {
            if (la[j] == item) {
                break;
            }
            j++;
        }

        // Logic note: j + 1 represents the human-readable position (1st, 2nd, 3rd...)
        System.out.printf("Found element %d at position %d\n", item, j + 1);
    }
}
