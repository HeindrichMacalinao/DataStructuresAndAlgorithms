public class LoopingWithArrayFibonacciSequence {

    public static void main(String[] args) {

        int termTotal = 10;

        int[] fibonacciSequence = new int[termTotal];

        fibonacciSequence[0] = 1;
        fibonacciSequence[1] = 1;

        for (int i = 2; i < termTotal; i++) {
            fibonacciSequence[i] =
                    fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        System.out.println("Fibonacci Sequence:");

        for (int i = 0; i < termTotal; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}