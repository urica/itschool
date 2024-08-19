package session_5_advanced_flow_control;

import java.util.Scanner;

public class IfAndSwitch {

    public static void main(String[] args) {
//        daysOfWeekWithIf();
//        dayOfWeekWithSwitch();

//        for (ZileleSaptamani zi : ZileleSaptamani.values()) {
//            System.out.println(zi);
//        }


//        ZileleSaptamani duminica = ZileleSaptamani.DUMINICA;
//
//        switch (duminica) {
//            case LUNI, MARTI, MIERCURI, JOI, VINERI -> System.out.println("Nu e weekend!");
//            default -> System.out.println("E weekend!");
//        }

//        int age = 25;
//        if (age < 7) {
//            System.out.println("Child");
//        } else if (age < 18) {
//            System.out.println("Teenager");
//        } else System.out.println("Adult");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : array) {
            if (i % 2 == 0)
                continue;
            System.out.println("NR: " + i);
        }
    }


    public static void daysOfWeekWithIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce day of week (1-7):");
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println("Luni");
        } else if (day == 2) {
            System.out.println("Marti");
        } else if (day == 3) {
            System.out.println("Miercuri");
        } else if (day == 4) {
            System.out.println("Joi");
        } else if (day == 5) {
            System.out.println("Vineri");
        } else if (day == 6) {
            System.out.println("Sambata");
        } else if (day == 7) {
            System.out.println("Duminica");
        } else {
            System.out.println("Numar invalid!");
        }
    }

    public static void dayOfWeekWithSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce day of week (1-7):");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Luni");
            case 2 -> System.out.println("Marti");
            case 5 -> System.out.println("Vineri");
            case 4 -> System.out.println("Joi");
            default -> System.out.println("Numar invalid!");
            case 6 -> System.out.println("Sambata");
            case 3 -> System.out.println("Miercuri");
            case 7 -> System.out.println("Duminica");
        }

    }

}
