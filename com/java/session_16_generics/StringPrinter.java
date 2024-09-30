package session_16_generics;

public class StringPrinter {
    private String thingToPrint;

    public StringPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
