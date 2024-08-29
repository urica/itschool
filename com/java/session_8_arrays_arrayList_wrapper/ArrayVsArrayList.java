package session_8_arrays_arrayList_wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates the differences between arrays and ArrayLists in Java.
 * It shows various operations like declaration, accessing elements, adding/removing elements,
 * and printing for both data structures.
 */
public class ArrayVsArrayList {
    /**
     * The main method that demonstrates various operations on arrays and ArrayLists.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String... args) {

        // Declare and initialize an array
        String[] friendArray = {"Sam", "Dan", "Ion", "Bob"};

        // Declare and initialize an ArrayList
        List<String> friendsArrayList = new ArrayList<>(Arrays.asList("Sam", "Dan", "Ion", "Bob"));

        // Note: Arrays are fixed-size, indexed from [0] to [3] in this case

        // Get value from array and ArrayList
        System.out.println(friendArray[1]); // Accessing array element
        System.out.println(friendsArrayList.get(1)); // Accessing ArrayList element

        // Get size of array and ArrayList
        System.out.println(friendArray.length); // Array length
        System.out.println(friendsArrayList.size()); // ArrayList size

        // Add value to ArrayList (not possible with fixed-size array)
        friendsArrayList.add("Pavel");
        System.out.println(friendsArrayList.get(4)); // Print newly added element

        // Set value in array and ArrayList
        friendArray[1] = "Maia"; // Modify array element
        System.out.println(friendArray[1]);
        friendsArrayList.set(1, "Maia"); // Modify ArrayList element
        System.out.println(friendsArrayList.get(1));

        // Remove value from ArrayList (not directly possible with array)
        friendsArrayList.remove("Maia");
        System.out.println(friendsArrayList.get(1)); // Print element at index 1 after removal

        // Print entire array and ArrayList
        System.out.println(Arrays.toString(friendArray)); // Convert array to string for printing
        System.out.println(friendsArrayList); // ArrayList's toString method is automatically called
    }
}