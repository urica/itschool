package session_8_arrays_arrayList_wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String... args) {

        //declare
        String[] friendArray = {"Sam", "Dan", "Ion", "Bob"};
        List<String> friendsArrayList = new ArrayList<>(Arrays.asList("Sam", "Dan", "Ion", "Bob"));
        //[0][1][2][3]
        //get value
        System.out.println(friendArray[1]);
        System.out.println(friendsArrayList.get(1));

        //size
        System.out.println(friendArray.length);
        System.out.println(friendsArrayList.size());

        //add value
        friendsArrayList.add("Pavel");
        System.out.println(friendsArrayList.get(4));

        //set value
        friendArray[1] = "Maia";
        System.out.println(friendArray[1]);
        friendsArrayList.set(1, "Maia");
        System.out.println(friendsArrayList.get(1));

        //remove
        friendsArrayList.remove("Maia");
        System.out.println(friendsArrayList.get(1));

        //print
        System.out.println(Arrays.toString(friendArray));
        System.out.println(friendsArrayList);


    }
}
