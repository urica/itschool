package com.waketraindev.homework;

/*
 * Description:
 * 1. Simple Output Program: Write a program that prints your name, age, and favorite color on three separate lines.
 */
public class Work01 {
    public static void main(String[] args) {

        final String firstName = "Eleni";
        final String lastName = "Haynes";
        final Integer age = 36;
        final String color = "black";

        System.out.printf("Name: %s %s%nAge: %d%nColor: %s%n", firstName, lastName, age, color);
    }
}
