public class Array {
    public static void main(String[] args) {
        // 1. Declare and initialize an array of Strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};

        // 2. Access a specific element (Indices start at 0)
        System.out.println("The first fruit is: " + fruits[0]);

        // 3. Change an element
        fruits[1] = "Blueberry";

        // 4. Loop through the array to print all elements
        System.out.println("Full list of fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }
    }
}
