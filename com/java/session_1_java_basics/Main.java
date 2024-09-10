package session_1_java_basics;

import session_10_OOP_concepts.Person;

public class Main {
    public static void main(String[] args) {
        // Variable declaration and initialization
        int userAge;  // Declare an integer variable to store age
        userAge = 30;  // Assign the value 30 to userAge

        int alternateAge = 30;  // Declare and initialize in one line
        System.out.println("User's age: " + userAge);  // Print the user's age

        // Working with multiple variables
        int num1, num2;  // Declare two integer variables
        num1 = 5;  // Assign 5 to num1
        num2 = 3;  // Assign 3 to num2

        // Arithmetic operations
        int sumResult = num1 + num2;  // Addition
        System.out.println("Sum result: " + sumResult);

        int differenceResult = num2 - num1;  // Subtraction
        System.out.println("Difference result: " + differenceResult);

        int productResult = num1 * num2;  // Multiplication
        System.out.println("Product result: " + productResult);

        int quotientResult = num1 / num2;  // Integer division
        System.out.println("Quotient result: " + quotientResult);

        int remainderResult = num1 % num2;  // Modulus (remainder)
        System.out.println("Remainder result: " + remainderResult);

        // String manipulation
        String firstName = "John";  // Declare and initialize a String variable
        String lastName = "Doe";  // Declare and initialize another String variable
        String fullName = firstName + " " + lastName;  // Concatenate strings
        System.out.println("Full name: " + fullName);

        // Different numeric data types
        double weight = 81.3;  // Declare and initialize a double (decimal) variable
        float height = 12.6f;  // Declare and initialize a float variable (note the 'f' suffix)
        long population = 10000000L;  // Declare and initialize a long variable (note the 'L' suffix)

        // Arithmetic with double
        System.out.println("Half of the weight: " + weight / 2);  // Divide weight by 2 and print

        Person p = new Person();
    }
}
