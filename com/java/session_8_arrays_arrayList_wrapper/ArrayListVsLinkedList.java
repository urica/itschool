/**
 * This class demonstrates the differences between ArrayList and LinkedList,
 * including performance comparisons and various operations.
 */
package session_8_arrays_arrayList_wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    /**
     * The main method demonstrates various operations on ArrayList and LinkedList.
     * @param args Command line arguments (not used).
     */
    public static void main(String... args) {
        // Initialize ArrayList and add elements
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Sam");
        arrayList.add("Ion");
        arrayList.add("Bob");
        arrayList.add("Iov");

        // Initialize LinkedList and add elements
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Sam");
        linkedList.add("Ion");
        linkedList.add("Bob");
        linkedList.add("Iov");

        // Get element from both lists
        System.out.println(arrayList.get(2));
        System.out.println(linkedList.get(2));

        // Add value at specific index
        arrayList.add(1, "Sara");
        linkedList.add(1, "Sara");

        // Remove elements
        arrayList.remove(1);
        linkedList.remove("Sara");

        // Stack implementation using LinkedList (LIFO)
        LinkedList<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.pop(); // Remove the last added element

        System.out.println(stack);

        // Call the conversions method
        conversions();
    }

    /**
     * Demonstrates various conversions between ArrayList and arrays.
     */
    private static void conversions() {
        // Create an ArrayList and add elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        // Convert ArrayList to array
        String[] arrayFromArrayList = arrayList.toArray(new String[0]);
        System.out.println(arrayList);
        System.out.println(Arrays.toString(arrayFromArrayList));

        // V1: Convert array to List (mutable but fixed size)
        List<String> fromArray = Arrays.asList(arrayFromArrayList);
        fromArray.set(0, "Z");
        System.out.println(fromArray);
        System.out.println(Arrays.toString(arrayFromArrayList));

        // V2: Convert array to unmodifiable List
        List<String> fromArray2 = List.of(arrayFromArrayList);
        // fromArray2.set(1,"ewr"); // This would throw an exception

        // V3: Convert array to fully mutable ArrayList
        List<String> fromArray3 = new ArrayList<>(Arrays.asList(arrayFromArrayList));
        System.out.println(fromArray3);
        System.out.println(Arrays.toString(arrayFromArrayList));

        fromArray3.set(1, "T");

        System.out.println(fromArray3);
        System.out.println(Arrays.toString(arrayFromArrayList));
    }

    /**
     * Compares performance of ArrayList and LinkedList for specific operations.
     */
    public static void arrayListVsLinkedList() {
        // Declare ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Add elements to both lists
        for (int i = 0; i < 500000; i++) {
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));
        }

        // Measure performance for ArrayList operations
        long startArrayTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            // arrayList.add(0, String.valueOf(i)); // Uncomment to test insertion at beginning
            arrayList.get(250000); // Test random access
        }
        long endArrayTime = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (endArrayTime - startArrayTime));

        // Measure performance for LinkedList operations
        long startLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            // linkedList.add(0, String.valueOf(i)); // Uncomment to test insertion at beginning
            linkedList.get(250000); // Test random access
        }
        long endLinkedListTime = System.currentTimeMillis();

        System.out.println("LinkedList time: " + (endLinkedListTime - startLinkedListTime));
    }
}