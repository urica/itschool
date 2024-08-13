package session_4_java_op_decision;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Commented out unused methods for now
//        sum(5, 6);
//        Main main = new Main();
//        int x = main.sum2(3, 6);
//        equality();

//        objectEquality();  // Commented out object equality example

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr:");  // Nr is likely a typo for "Number"
        int x = scanner.nextInt();
        ex3(x);
    }

    private static void ex3(int x) {
        // Replaced if-else with ternary operator for cleaner syntax
        String result = (x > 0) ? "positive" : (x == 0) ? "0" : "negative";
        System.out.println("result = " + result);
    }

    private static void objectEquality() {
        // Demonstrates how object reference comparison works
        Person pers1 = new Person("Sam");
        Person pers2 = new Person("Ion");

        Person pers3 = pers1;  // pers3 now points to the same object as pers1

        System.out.println(pers1 == pers2); //false - different objects
        System.out.println(pers1 == pers3); //true - both point to the same object
    }

    private static void equality() {
        // Demonstrates basic comparison operators
        int a = 5;
        int b = 10;

        System.out.println(a == b); //false - checks if values are equal
        System.out.println(a != b); //true - checks if values are not equal
    }

    private static void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public int sum2(int a, int b) {
        // This method returns the sum of a and b
        return a + b;
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}