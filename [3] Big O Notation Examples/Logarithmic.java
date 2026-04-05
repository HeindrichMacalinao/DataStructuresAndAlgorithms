package com.big.o.notation;
/**
 * This class demonstrates Binary Search.
 * Binary search works by repeatedly dividing the search interval in half.
 * The array MUST be sorted for this algorithm to work.
 */
public class Logarithmic {

    public static void main(String[] args) {
        // Sorted array required for Binary Search
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int target = 9;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            // Indexing starts at 0
            System.out.println("Element found at index: " + result);
        }
    }
    /**
     * Performs binary search on a sorted integer array.
     * * @param arr    The sorted array to search in.
     * @param target The value to look for.
     * @return The index of the target, or -1 if not found.
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Calculate the middle point
            int mid = (low + high) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Target was not found in the array
        return -1;
    }
}