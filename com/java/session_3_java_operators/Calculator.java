package session_3_java_operators;

public class Calculator {
    public static void main(String[] args) {
        int val1 = 10; // First operand
        int val2 = 5; // Second operand
        int rez; // Result of the operation
        char op = 'M'; // Operator for the calculation

        // Check the operator and perform the corresponding operation
        if (op == 'A') { // Addition
            rez = val1 + val2;
        } else if (op == 'S') { // Subtraction
            rez = val1 - val2;
        } else if (op == 'D') { // Division
            rez = val1 / val2;
        } else if (op == 'M') { // Multiplication
            rez = val1 * val2;
        } else { // Default case if operator is not valid
            System.out.println("else");
            rez = 0;
        }

        System.out.println("REZ = " + rez); // Print the result

    }
}
