package com.waketraindev.homework;

/*
 * Description:
 * 2. Using Variables: Write a program that defines four different variables
 * (an integer, a double, a character, and a string), assigns them values, and then prints them out.
 */

public class Work02 {
    public static void main(String[] args) {
        final int intVariable = 10;
        final double doubleVariable = 13.37d;
        final char charVariable = 'X';
        final String stringVariable = "Hello World";

        System.out.printf("Int: %d, Double: %f, Char: %c, String %s%n", intVariable, doubleVariable, charVariable, stringVariable);
    }
}
