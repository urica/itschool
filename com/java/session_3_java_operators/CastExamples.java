package session_3_java_operators;

public class CastExamples {
    public static void main(String[] args) {
        // Declare variables of different numeric types
        float floatVal = 1.0f; // Single-precision floating-point number
        double doubleVal = 4.0d; // Double-precision floating-point number
        byte byteVal = 7; // 8-bit integer
        short shortVal = 7; // 16-bit integer
        long longVal = 5; // 64-bit integer
        long longVal2 = 513157145134615L; // Large 64-bit integer

        //Implicit conversion:byte to short
        short rez1 = byteVal; // Allowed because byte is smaller than short

        // Explicit conversion: long to short (potential data loss)
        short rez2 = (short) longVal; // Cast long to short, might lose precision
        short rez3 = (short) longVal2; // Cast large long to short, significant data loss
        System.out.println("rez3 = " + rez3); // Print the result of the cast

        // Mixed-type arithmetic: long to float (implicit conversion)
        float rez4 = longVal - floatVal; // Subtract float from long, result is float
        System.out.println("rez4 = " + rez4); // Print the result of the calculation

        int a = 2;
        int b = 3;
        int c = 4;

        // Compound assignment operators
        // a += b; // Equivalent to a = a + b;
        // a += b * 2; // Equivalent to a = a + (b * 2);
        // a += c * b - 5; // Equivalent to a = a + (c * b - 5);
        // System.out.println("A = " + a);

        // Compound assignment operator with multiplication
        // a *= c * 2 + 2; // Equivalent to a = a * (c * 2 + 2);
        // System.out.println("a = " + a);

        // Compound assignment operator with increment/decrement
        b *= a-- + ++c * 2; // Equivalent to b = b * (a-- + (++c * 2));


    }
}
