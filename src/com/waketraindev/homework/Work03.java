package com.waketraindev.homework;

/*
 * Description:
 * 3. Operations: Write a program that performs various operations (addition, subtraction, multiplication, division, and modulus)
 * on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.
 */
public class Work03 {
    public static void main(String[] args) {
        final int a = 5, b = 3;

        System.out.printf("Addition:\t\t %d + %d = %d %n", a, b, (a + b));
        System.out.printf("Substraction:\t %d - %d = %d %n", a, b, (a - b));
        System.out.printf("Multiplication:\t %d * %d = %d %n", a, b, (a * b));
        System.out.printf("Division:\t\t %d / %d = %.2f %n", a, b, (1d * a / b));
        System.out.printf("Modulo:\t\t\t %d %% %d = %d %n", a, b, (a % b));
    }
}
