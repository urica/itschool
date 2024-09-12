package session_12_abstraction;

public class Main {
    public static void main(String... args) {
        AClassNonabstract a = new AClassNonabstract();
        a.print();
        a.display();

        Caine caine = new Caine("Azorel", 4);
        caine.alearga();
        caine.eat();
        caine.sound();
    }
}
