package session_9_recap;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String... args) {
        String str = "Hello";

        System.out.println(str);
        System.out.println(str.concat(" World!"));

        LocalDate date = LocalDate.of(2024,2,29);
        System.out.println(date.plusYears(1));

        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1,3);
        System.out.println(list);

        if(false & m()){
            System.out.println("I");
        }

    }

    public static boolean  m(){
        System.out.println("M");
        return true;
    }
}
