package session_3_java_operators;

public class Classroom {
    public static void main(String[] args) {
        int students = 150; // Total number of students
        int rooms = 0; // Number of available rooms (initially set to 0)

        // Check if there are rooms available and if the number of students per room is greater than 30
        if (rooms != 0 && students / rooms > 30) { // Both conditions must be true for the block to execute
            System.out.println("Crowded!");
        }

        System.out.println("*** end of program ***");
    }
}
