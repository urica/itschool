package session_17_lambda;

@FunctionalInterface
public interface Printable {
    String print(String p1);

    default void faAltceva(){
        System.out.println("fa altceva!");
    }
}
