/*
Task:
Write a Java program that generates a Fibonacci sequence. The program should ask the user for an
input number and then print the Fibonacci sequence up to that number.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

    private static long[] fibonacci_numbers;

    public static void main(String[] args) {

        // Get user input
        Scanner scanner = new Scanner(System.in);
        int user_input = 0;
        // set initial user input value to 0

        boolean validInput = true;
        // Use while to handle negative input errors
        while (validInput) {
            System.out.println(" ");
            System.out.print(" Enter a number to generate a sequence upto that number : ");
            try {
                user_input = scanner.nextInt();
                if (user_input < 0) {
                    System.out.println(" ");
                    System.out.println("Please enter a positive integer to validate this sequence.");
                } else {
                    // set the validinput value to false
                    validInput = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("Please enter a valid input, ensure its an integer");
                //code to clear input
                scanner.nextLine();

            }
        }
        scanner.close();

        fibonacci_numbers = new long[user_input + 1];

        for (int i = 0; i <= user_input; i++) {
//             Display the fibonnacci sequence
            System.out.print(fibonacci_calculant(i) + " ");
        }
    }

    private static long fibonacci_calculant(int n) {
        if (n<=1) {
            return n;
        }

        if (fibonacci_numbers[n] != 0) {
            return fibonacci_numbers[n];
        }

        long next_fibonacci_number = (fibonacci_calculant(n-1) + fibonacci_calculant(n-2));

        fibonacci_numbers[n] = next_fibonacci_number;

        return next_fibonacci_number;
    }
}