import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input: number must be positive.");
                return;
            }

            int sum = 0;
            for (int divisor = 1; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }

            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter an integer.");
        } finally {
            input.close();
        }
    }
}
