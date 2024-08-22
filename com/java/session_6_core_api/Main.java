package session_6_core_api;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
//        stringPool();
//        productCodeComparison();
//        stringOperations();

//        stringCreation();

        StringBuilder sb = new StringBuilder("Hello World!");
        System.out.println("Revers: " + sb.reverse().toString());

//        String[] words = {"Sam", "Ion", "Dan", "Bob"};
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String word : words) {
//            stringBuilder.append(word).append(" ");
//        }
//        System.out.println("Concatenated string: " + stringBuilder.toString());

//        StringJoiner stringJoiner = new StringJoiner(" ", "[", "]");
//        for (String word : words) {
//            stringJoiner.add(word);
//        }
//        System.out.println("Concatenated string: " + stringJoiner.toString());

    }

    public static void stringCreation() {
        // Example demonstrating string creation and identity
        String s1 = Integer.valueOf(1000).toString();
        String s2 = "1000";
        String s3 = new String("1000");
        String s4 = "1000";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2 == s4: " + (s2 == s4));

        System.out.println("s1 identity: " + System.identityHashCode(s1));
        System.out.println("s2 identity: " + System.identityHashCode(s2));
        System.out.println("s3 identity: " + System.identityHashCode(s3));
        System.out.println("s4 identity: " + System.identityHashCode(s4));

    }

    public static void stringOperations() {
        // Examples demonstrating various string operations
        String str = "Hello World!";
        String str1 = "hello world!";
        System.out.println("Using equals: " + str.equals(str1));
        System.out.println("Using equalsIgnoreCase: " + str.equalsIgnoreCase(str1));

        System.out.println("The length of str = " + str.length());
        System.out.println("The character at index 1 is: " + str.charAt(1));
        System.out.println("The index of 'l' is: " + str.indexOf("l"));
        System.out.println("The substring from index 0 to 5 is: " + str.substring(0, 5));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Starts with 'He' ? " + str.startsWith("He"));
        System.out.println("Ends with '!' ? " + str.endsWith("!"));

        String str5 = "Hello World!";
        int middleIndex = str5.length() / 2;
        String middleSubstring = str5.substring(middleIndex - 1, middleIndex + 2);
        System.out.println("The middle three chars are: " + middleSubstring);

        // Example extracting domain from email
        String email = "user@example.com";
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println("domain = " + domain);

        String domain2 = email.split("@")[1];
        System.out.println("domain2 = " + domain2);
    }


    public static void stringPool() {
        // Example demonstrating string literals and string objects
        String str = "Hello World!";
        String str1 = "Hello World!";
        String str2 = new String("Hello World!");
        String str3 = new String("Hello World!");

        System.out.println("str == str1:" + (str == str1)); //true
        System.out.println("str.equals(str1): " + str.equals(str1)); //true
        System.out.println("str2 == str3 : " + (str2 == str3)); //false
        System.out.println("str2.equals(str3) : " + str2.equals(str3)); //true
    }

    public static void productCodeComparison() {
        // Example comparing string literals and string objects
        String code = "PROD12345";
        String code1 = new String("PROD12345");
        String code2 = "PROD12345";
        String code3 = "PROD";
        code3 += "12345";

        System.out.println("code3 = " + code3);
        System.out.println("Using == operator:");
        System.out.println("code == code1: " + (code == code1)); //false
        System.out.println("code == code2: " + (code == code2)); //true
        System.out.println("code == code3: " + (code == code3)); //false

    }
}
