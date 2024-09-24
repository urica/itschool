package session_15_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExamples {
    public static void main(String... args) {
        Map<String, Integer> hasMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        hasMap.put("Romania", 20000000);
        hasMap.put("Germania", 85000000);
        hasMap.put("Franta", 66000000);

        treeMap.put("Romania", 20000000);
        treeMap.put("Germania", 85000000);
        treeMap.put("Franta", 66000000);

        System.out.println("HashMap: " + hasMap);
        System.out.println("TreeMap: " + treeMap);

        //print contains
        System.out.println("Contains Romania: " + hasMap.containsKey("Romania"));
        System.out.println("Contains 20000000: " + treeMap.containsValue(20000000));

        for (String key : hasMap.keySet()) {
            System.out.println("Key: " + key + " - Value: " + hasMap.get(key));
        }

        for (var entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

        //Update
        hasMap.put("Romania", 19000000);
        System.out.println(hasMap);

        TreeMap<String, Integer> tree = new TreeMap<>(treeMap);

        System.out.println("Prima intrare: " + tree.firstEntry());
        System.out.println("Ultima intrare: " + tree.lastEntry());
        System.out.println("Intrare inferioara Germania: " + tree.lowerEntry("Germania"));
        System.out.println("Intrare superioara Germania: " + tree.higherEntry("Germania"));

    }
}
