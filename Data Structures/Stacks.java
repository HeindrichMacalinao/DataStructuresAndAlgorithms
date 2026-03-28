import java.util.Stack;

public class Stacks 
{
    public static void main(String[] args) 
    {
        Stack<String> myStack = new Stack<>();

        System.out.println("Is my stack empty? " + myStack.empty());

        myStack.push("Orange Ball");
        myStack.push("Violet Ball");
        myStack.push("Green Ball");

        System.out.println("Elements in Stack: " + myStack);
        System.out.println("Is my stack empty? " + myStack.empty());
        
        while (!myStack.isEmpty()) {
            myStack.pop();
            System.out.println("Elements in Stack: " + myStack);
            System.out.println("Is my stack empty? " + myStack.empty());
        }
    }
}
