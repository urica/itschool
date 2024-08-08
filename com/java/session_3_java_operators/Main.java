package session_3_java_operators;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize integer variables
        int valA = 21; // First value
        int valB = 6; // Second value
        int valC = 3; // Third value
        int valD = 1; // Fourth value

        // Calculate the first result: Division occurs before subtraction due to operator precedence
        int rez1 = valA - valB / valC;
        System.out.println("Rez1 = " + rez1);

        // Calculate the second result: Parentheses force subtraction before division
        int rez2 = (valA - valB) / valC;
        System.out.println("Rez2 = " + rez2);

        // Calculate the third result: Division and multiplication have equal precedence, evaluated from left to right
        int rez3 = valA / valC * valD + valB;
        System.out.println("rez3 = " + rez3);

        // Calculate the fourth result: Parentheses control the order of operations
        int rez4 = valA / (valC * (valD + valB));
        System.out.println("rez4 = " + rez4);

    }
}
