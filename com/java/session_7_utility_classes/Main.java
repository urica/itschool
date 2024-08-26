package session_7_utility_classes;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        demonstrateDateTimeOperations();
//        demonstrationRandomNumberGenerator();
//        demoMath();
//        readFromFileWithScanner();
        gui();
    }

    private static void gui() {
        JFrame frame = new JFrame("GUI Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("");

        button.addActionListener(e -> label.setText("Salut Sam!"));

        frame.getContentPane().add(button, "North");
        frame.getContentPane().add(label, "Center");

        frame.setVisible(true);
    }

    private static void readFromFileWithScanner() {
        try {
            Scanner scanner = new Scanner(new File("example.txt"));

            while (scanner.hasNextLine()) {
                System.out.println("TEXT: " + scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File was not found!!!");
        }

    }

    private static void demoMath() {
        double a = 5.3;
        double b = 8.2;

        double max = Math.max(a, b);
        System.out.println("MAX: " + max);

        long roundedB = Math.round(b);
        System.out.println("B rounded: " + roundedB);
    }

    private static void demonstrationRandomNumberGenerator() {
        System.out.println(" === Random Number Generator ===");

        Random random = new Random();

        int randomInt = random.nextInt(100) + 1; //1 to 100
        System.out.println("Random int: " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("Random Double : " + randomDouble);// (0-1)

        String[] names = {"Sam", "Ion", "Dan", "Ilie"};
        String theChosen = names[random.nextInt(names.length)];
        System.out.println("Random name: " + theChosen);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Collections.shuffle(numbers, random);
        System.out.println("list: " + numbers);
    }

    private static void demonstrateDateTimeOperations() {
        System.out.println("=== Date and Time Operations ===");

        LocalDate today = LocalDate.now();
        System.out.println("Today`s date: " + today);
        LocalDate tenDaysLater = today.plusDays(10);
        System.out.println("Date after 10 days: " + tenDaysLater);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
        LocalDateTime futureDateTime = currentDateTime.plusHours(5).plusMinutes(30);
        System.out.println("5 hours and 30 min later: " + futureDateTime);

        LocalDateTime futureDate = LocalDateTime.of(2025, 1, 1, 10, 30);
        String result = futureDate.isBefore(LocalDateTime.now()) ? "before" : "after";
        System.out.println(futureDate + " is " + result + " current date time");

        //parsing
        String dateTimeString = "2025-01-01 10:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed local date time: " + parsedDateTime);

        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        System.out.println("New format date time: " + parsedDateTime.format(newFormat));

        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        System.out.println("java.util.Date : " + utilDate);
        System.out.println("java.sql.Date : " + sqlDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = simpleDateFormat.format(utilDate);
        System.out.println("Formatted time: " + formattedTime);

        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Timestamp: " + currentTimestamp);

        Timestamp timestamp1 = Timestamp.valueOf("2024-08-26 18:00:00.123");
        Timestamp timestamp2 = Timestamp.valueOf("2024-08-26 18:03:00.123");

        long diffInSeconds = (timestamp2.getTime() - timestamp1.getTime()) / 1000;
        System.out.println("Diff : " + diffInSeconds);

    }
}


