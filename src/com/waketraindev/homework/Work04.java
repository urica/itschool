package com.waketraindev.homework;

/*
 * Description:
 * 4. Simple Input/Output: Write a program that asks the user to enter two numbers, performs addition on those numbers,
 * and prints out the result.
 */

import java.util.Scanner;

public class Work04 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Age (years): ");
        final int age = inputScanner.nextInt();
        System.out.print("Height (centimeters): ");
        final int height = inputScanner.nextInt();
        System.out.print("Weight (kilograms): ");
        final double weight = inputScanner.nextDouble();

        final int maxHeartRate = 220 - age;
        final double bmi = (weight / height / height * 10_000);
        System.out.printf("BMI: %.2f, Max Heart Rate: %d %n", bmi, maxHeartRate);

    }
}
