package session_11_Encapsulation_vs_Inheritance;

public class TrickyClass {
    int x;

    TrickyClass(int x) {
        this.x = x;
    }

    TrickyClass(TrickyClass other) {
        this(other.x);
    }

    void method(int x) {
        this.x += x;
    }

    void method(TrickyClass other) {
        method(other.x);
    }

    public static void main(String... args){
        TrickyClass obj1 = new TrickyClass(5);
        TrickyClass obj2 = new TrickyClass(obj1);
        obj1.method(3);
        obj2.method(obj1);
        System.out.println(obj1.x + " " + obj2.x);
    }
}