package session_16_generics;

public class IntegerPrinter {
    private int thingToPrint;

    public IntegerPrinter(int thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
