public class EvenSquareCube {
    public static void main(String[] args) {

        // Initialization of variable take O(1)
        int totalSquareSum = 0;
        int totalCubeSum = 0;

        System.out.println("Number\tSquare\tCube");

        for(int i = 2; i <= 10; i+= 2) {
            int square = i*i;
            int cube = i*i*i;

            System.out.println(i + "\t\t" + square + "\t\t" + cube);

            totalSquareSum += square;
            totalCubeSum += cube;
        }
        System.out.println("Total \t" + totalSquareSum + "\t\t" + totalCubeSum);
    }
}
