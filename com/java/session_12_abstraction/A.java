package session_12_abstraction;

public interface A {
    void print(); // public abstract

    default void display() {
        System.out.println("Default method");
    }
}
