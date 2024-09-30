package session_16_generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String... args) {
//        equalsExamples();
        genericExamples();
    }

    public static void genericExamples() {
        IntegerPrinter integerPrinter = new IntegerPrinter(5);
        integerPrinter.print();

        StringPrinter stringPrinter = new StringPrinter("bla bal");
        stringPrinter.print();

//        Printer<Integer> intPrinter = new Printer<>(52);
//        Printer<String> strPrinter = new Printer<>("ha ha");
//        intPrinter.print();
//        strPrinter.print();

        Printer<Cat> catPrinter = new Printer<>(new Cat());
        catPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.print();


        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

//        Cat cat = catList.get(0);

        print(2, "hihi");

        List<Integer> intList = new ArrayList<>();
        intList.add(6);

//        printList(intList);
        printListWhildcard(intList);
        printListWhildcard(catList);

        printListWhildcard2(catList);
    }

    //metoda generica cu 2 parametrii
    public static <T, E> void print(T p1, E p2) {
        System.out.println("p1: " + p1 + " p2: " + p2);
    }

    public static void printList(List<Object> list) {
        System.out.println(list);
    }

    public static void printListWhildcard(List<?> list) {
        System.out.println(list);
    }

    public static void printListWhildcard2(List<? extends Animal> list) {
        System.out.println(list);
    }

    public static void equalsExamples() {
        Persoana p1 = new Persoana("Ion", 30);
        Persoana p2 = new Persoana("Ion", 30);
        Persoana p3 = new Persoana("Maria", 25);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        Set<Persoana> set = new HashSet<>();
        System.out.println("Adauga p1: " + set.add(p1));
        System.out.println("Adauga p2: " + set.add(p2));
        System.out.println("Adauga p3: " + set.add(p3));

        System.out.println("Set size: " + set.size());
    }
}
