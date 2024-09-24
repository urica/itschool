package session_15_collections;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fructe = new ArrayList<>(Arrays.asList("mar", "banana", "portocala", "pruna"));

        for (String fruct : fructe) {
            System.out.println(fruct);
//            if (fruct.equals("banana")) {
//                fructe.remove(fruct);
//            }
        }

        //interator
        Iterator<String> iterator = fructe.iterator();

        while (iterator.hasNext()) {
            String fruct = iterator.next();
            System.out.println("FRUCT: " + fruct);
            if (fruct.equals("banana")) {
                iterator.remove();
            }
        }

        System.out.println("Lista dupa stergere: " + fructe);

        List<Munte> munti = new ArrayList<>();
        munti.add(new Munte("Everest", 8840));
        munti.add(new Munte("K2", 8644));
        munti.add(new Munte("Makalu", 8300));

        System.out.println("Munti initial: " + munti);
        Collections.sort(munti);

        System.out.println("Munti dupa sort: " + munti);
        Collections.sort(munti, new ComparatorMunte());

        System.out.println("Munti dupa sortare nume: " + munti);




    }
}
