package session_16_generics;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("ham ham");
    }

    @Override
    public String toString() {
        return "Cainele face ham ham";
    }
}
