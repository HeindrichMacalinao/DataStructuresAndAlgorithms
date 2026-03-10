import java.util.*;
public class NumbersInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        
        //do while loop for termination of program when user inputs 4
        do {
            System.out.println("1. Sum of N number in an array");
            System.out.println("2. Maximum and Minimum Number");
            System.out.println("3. Distinct Number");
            System.out.println("4. Exit");
            System.out.print(" Enter option [1..4] ");
            option = input.nextInt();
            //switch case for options
            switch (option) {
                case 1:
                    sumOfArray();
                    break;
                case 2:
                    findMinMax();
                    break;
                case 3:
                    deleteDuplicate();
                    break;
                case 4:
                    System.out.println(" \nTerminating the program...");
                    break;
            }

        } while (option != 4);
    }

    //method for sum on numbers in an array
    public static void sumOfArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n1. SUM OF N NUMBERS IN AN ARRAY");
        System.out.print(" Input Array Size\t");
        int size = input.nextInt();
        int[] sumArray = new int[size];
        int sum = 0;
        System.out.print(" Input " + size + " values ");
        for (int n = 0; n < size; n++) {
            sumArray[n] = input.nextInt();
            sum = sum + sumArray[n];
        }
        System.out.println(" Sum of " + size + " values: " + sum + "\n");
    }

    //method for finding the minimum and maximum value inside an array
    public static void findMinMax() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n2. FIND THE MAXIMUM AND MINIMUM OF N NUMBERS IN AN ARRAY.");

        System.out.print(" Input Array Size\t");
        int size = input.nextInt();
        int[] arrayMinMax = new int[size];
        System.out.print(" Input " + size + " values ");
        for (int n = 0; n < size; n++) {
            arrayMinMax[n] = input.nextInt();
        }
        int min = arrayMinMax[0];
        int max = arrayMinMax[0];
        for (int i = 1; i < arrayMinMax.length; i++) {
            if (arrayMinMax[i] < min) {
                min = arrayMinMax[i];
            }
            if (arrayMinMax[i] > max) {
                max = arrayMinMax[i];
            }
        }
        System.out.println(" Maximum value: " + max);
        System.out.println(" Minimum value: " + min + "\n");
    }

    //method for deleting duplicate values inside an array
    public static void deleteDuplicate() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n3. WRITE A PROGRAM TO DELETE DUPLICATE VALUES IN AN ARRAY");

        System.out.print(" Input Array Size\t");
        int size = input.nextInt();
        int[] deleteArray = new int[size];
        System.out.print(" Input " + size + " values ");
        for (int n = 0; n < size; n++) {
            deleteArray[n] = input.nextInt();
        }
        System.out.print(" Distinct Value: ");
        for (int i = 0; i < size; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (deleteArray[i] == deleteArray[j]) {
                    isDistinct = false;
                }
            }
            if (isDistinct) {
                System.out.print(deleteArray[i] + " ");
            }
        }
        System.out.print("\n\n");
    }
}
