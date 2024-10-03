package session_17_lambda;

public class LambdaExamples {
    public static void main(String... args) {
        Printable printable = s -> {
            System.out.println("salut");
            return "ciau" + s;
        };

        printThing(printable);
//        printThing(() -> System.out.println("salut"));

        StringProcessor removeWhitespaces = str -> str.replace(" ", "");
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhitespaces.andThen(toUpperCase);

        System.out.println(combined.process("hello world"));


        Calculator calculator = (a, b, operator) -> calcImpl(a,b,operator);

        System.out.println(calculator.calculate(3, 5, '+'));
    }

    public static double calcImpl(double a, double b, char op){
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a / b;
        }
    }

    public static void printThing(Printable print) {
        System.out.println(print.print("!"));
    }
}
