package session_17_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousVsLambda {
    public static void main(String... args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("b");
        list.add("c");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Sorted list: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

        Comparator<String> com = (o1, o2) -> o1.compareTo(o2);

        Collections.sort(list, com);

        System.out.println("Sorted list: " + list);

    }
}
