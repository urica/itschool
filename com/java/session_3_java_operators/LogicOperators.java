package session_3_java_operators;

public class LogicOperators {
    public static void main(String[] args) {
        // Declare a boolean variable and initialize it to false
        boolean boolVal = false;
        System.out.println("boolVal = " + boolVal); // Print the value of boolVal

        // Negate the boolean value and print the result
        System.out.println(!boolVal); // Output: true

        // Ternary operator: condition ? value if true : value if false
        int a = !(3 < 5) ? 4 : 5; // a will be 5 because 3 is less than 5
        String name = "Sam";
        int age = name.equals("Sam") ? 30 : 40; // age will be 30 because name is "Sam"
        System.out.println("Sam has " + age + " years");

        // Compare two integer values using if-else statements
        int valA = 3;
        int valB = 3;

        if (valA < valB) {
            System.out.println("First number is less than second one");
            valB++; // Increment valB if the condition is true
        } else if (valB < valA) {
            System.out.println("Second number is less than first one");
        } else {
            System.out.println("Numbers are equals!");
        }
    }
}
