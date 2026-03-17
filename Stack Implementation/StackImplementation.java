import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
    static Stack<Integer> stack = new Stack<>();
    static int maxSize;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in the stack: ");
        maxSize = input.nextInt();

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. TOP");
            System.out.println("4. SIZE");
            System.out.println("5. EMPTY");
            System.out.println("6. DISPLAY STACK");
            System.out.println("7. EXIT");
            System.out.print("Enter choice [1..7]: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    push(input);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    top();
                    break;
                case 4:
                    System.out.println("Current stack size: " + stack.size());
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("TRUE: The stack is empty.");
                    } else {
                        System.out.println("FALSE: The stack is not empty.");
                    }
                    break;
                case 6:
                    displayStack();
                    break;
                case 7:
                    System.out.println("Heindrich Himmler A. Macalinao");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void push(Scanner input) {
        if (stack.size() < maxSize) {
            System.out.print("Enter an integer to push: ");
            int value = input.nextInt();
            stack.push(value);
            System.out.println("Element pushed successfully. Current stack: " + stack);
        } else {
            System.out.println("Stack Overflow.");
        }
    }

    public static void pop() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            int removedElement = stack.pop();
            System.out.println("Element popped: " + removedElement);
        }
    }

    public static void top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stack.peek());
        }
    }

    public static void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Current stack: " + stack);
        }
    }
}