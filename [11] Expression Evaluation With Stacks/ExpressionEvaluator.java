import java.util.ArrayList;

public class ExpressionEvaluator {

    // Stack Implementation
    static class Stack<T> {
        private ArrayList<T> items = new ArrayList<>();

        public void push(T item) {
            items.add(item);
        }

        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return items.remove(items.size() - 1);
        }

        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return items.get(items.size() - 1);
        }

        public boolean isEmpty() {
            return items.isEmpty();
        }
    }

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public static String infixToPostfix(String expression) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                output.append(token).append(" ");
            } else if (token.equals("(")) {
                stack.push('(');
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop()).append(" ");
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Remove '('
                }
            } else { // operator
                while (!stack.isEmpty() && precedence(token.charAt(0)) <= precedence(stack.peek())) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(token.charAt(0));
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression"; // Unmatched parenthesis
            }
            output.append(stack.pop()).append(" ");
        }
        return output.toString().trim();
    }

    // Utility Methods
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int performOperation(String operator, int a, int b) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        // Test 1: Simple postfix evaluation
        String postfixExp1 = "5 3 2 * +";
        System.out.println("Postfix Expression: " + postfixExp1);
        System.out.println("Result: " + evaluatePostfix(postfixExp1));

        // Test 2: Infix to postfix conversion
        String infixExp1 = "3 + 4 * 2 / ( 1 - 5 )";
        String postfixExp2 = infixToPostfix(infixExp1);
        System.out.println("\nInfix Expression: " + infixExp1);
        System.out.println("Converted to Postfix: " + postfixExp2);
        System.out.println("Result: " + evaluatePostfix(postfixExp2));

        // Test 3: More complex expression
        String infixExp2 = "5 * ( 6 + 2 ) - 12 / 4";
        String postfixExp3 = infixToPostfix(infixExp2);
        System.out.println("\nInfix Expression: " + infixExp2);
        System.out.println("Converted to Postfix: " + postfixExp3);
        System.out.println("Result: " + evaluatePostfix(postfixExp3));
    }
}
