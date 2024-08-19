package session_5_advanced_flow_control;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        whileExampleWithContinue();
//        nestedForExample();
//        nestedForExampleWithoutLabel();

//        boolean bol = nestedForExampleWithReturn();
//        if (bol) {
//            System.out.println("Found it!");
//        } else System.out.println("Value not found!");
        doWhileExample();

        System.out.println("DONE");
    }

    /**
     * Demonstrates a do-while loop that repeatedly prompts the user for a positive number until a valid input is provided.
     */
    private static void doWhileExample() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Introduce a positive number:");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    /**
     * Demonstrates a while loop with a continue statement. The continue statement skips the current iteration when i is equal to 3.
     */
    private static void whileExampleWithContinue() {
        int i = 0;
        int sum = 0;

        while (i <= 4) {
            if (i == 3) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }

    /**
     * Demonstrates a nested for loop that searches for a specific value (searchVal) within a 2D array (matrix).
     * Achieves the same functionality as nestedForExample() but without using a labeled break statement.
     */
    private static void nestedForExample() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchVal = 5;

        SEARCH:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchVal) {
                    System.out.println("Fount it!");
                    break SEARCH;
                }
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println("DONE");
    }

    /**
     * Demonstrates a nested for loop that searches for a specific value (searchVal) within a 2D array (matrix).
     * Achieves the same functionality as nestedForExample() but without using a labeled break statement.
     */
    private static void nestedForExampleWithoutLabel() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchVal = 5;

        boolean found = false;
        for (int i = 0; i < matrix.length && !found; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchVal) {
                    System.out.println("Fount it!");
                    found = true;
                    break;
                }
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println("DONE");
    }

    /**
     * Demonstrates a nested for loop that searches for a specific value (searchVal) within a 2D array (matrix).
     * Uses a return statement to exit the method as soon as the value is found.
     */
    private static boolean nestedForExampleWithReturn() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchVal = 5;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchVal) {
                    return true;
                }
                System.out.println(matrix[i][j] + " ");
            }
        }

        return false;
    }

}

