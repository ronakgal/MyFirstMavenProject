package Firstpackage;

import java.util.Scanner;

public class DemoProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = 0;
        int tempNumber = originalNumber; // Use a temporary variable to preserve the original number

        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            tempNumber /= 10; // Remove the last digit from the temporary number
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);

        //scanner.close();
    }
}