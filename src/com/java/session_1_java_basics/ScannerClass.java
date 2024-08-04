package session_1_java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        // Print all command-line arguments as an array
        System.out.println(Arrays.toString(args));

        // Print individual command-line arguments
        System.out.println("Age: " + args[0]);  // First argument is assumed to be age
        System.out.println("Name: " + args[1]);  // Second argument is assumed to be name
        System.out.println("Color: " + args[2]);  // Third argument is assumed to be color

        // Create a Scanner object to read user input
        Scanner inputScanner = new Scanner(System.in);

        // Prompt user for name and read input
        System.out.println("Insert your name: ");
        String userName = inputScanner.nextLine();
        System.out.println("My name is " + userName);

        // Prompt user for two numbers and calculate their sum
        System.out.println("Insert first number: ");
        int firstNumber = inputScanner.nextInt();

        System.out.println("Insert second number: ");
        int secondNumber = inputScanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Sum of the two numbers: " + result);

        // Close the Scanner to prevent resource leak
        inputScanner.close();

        // Demonstrating increment operators
        int counter = 1;
        System.out.println("counter = " + counter);  // Prints 1
        counter = counter + 1;  // Increment by 1
        System.out.println("counter = " + counter);  // Prints 2
        counter++;  // Post-increment
        System.out.println("counter = " + counter);  // Prints 3

        System.out.println("counter = " + ++counter);  // Pre-increment, prints 4
        System.out.println("counter = " + counter++);  // Post-increment, prints 4
        System.out.println("counter = " + counter);  // Prints 5

        // Demonstrating increment and decrement in expressions
        int num1, num2;
        num1 = 3;
        num2 = 5;

        int sum = num1 + num2++;  // Use num2, then increment it
        System.out.println("sum = " + sum);  // Prints 8
        System.out.println("num2 = " + num2);  // Prints 6
        num1--;  // Decrement num1
        System.out.println("num1 = " + num1);  // Prints 2

        int result2 = ++num1 + num2--;  // Increment num1, use it, use num2, then decrement num2
        System.out.println("result2 = " + result2);  // Prints 9
    }
}
