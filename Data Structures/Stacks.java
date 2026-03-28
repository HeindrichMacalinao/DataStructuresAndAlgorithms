package prac;

import java.util.Stack;

public class Sandbox 
{
    public static void main(String[] args) 
    {
        // Creating a stack of Strings
        Stack<String> myStack = new Stack<>();

        System.out.println("Is my stack empty? " + myStack.empty());

        // Pushing elements onto the stack
        myStack.push("Orange Ball");
        myStack.push("Violet Ball");
        myStack.push("Green Ball");

        System.out.println("Elements in Stack: " + myStack);
        System.out.println("Is my stack empty? " + myStack.empty());

        // Popping elements until the stack is empty
        while (!myStack.isEmpty()) {
            myStack.pop();
            System.out.println("Elements in Stack: " + myStack);
            System.out.println("Is my stack empty? " + myStack.empty());
        }
    }
}
