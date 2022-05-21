package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int maxNumber = 40;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        int i = 1;
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

            ++i;
        }
    }

}
