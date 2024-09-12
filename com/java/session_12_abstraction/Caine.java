package session_12_abstraction;

public class Caine extends Tetrapods {

    public Caine(String name, int members) {
        super(name, members);
    }

    @Override
    void alearga() {
        System.out.println("Alearga pe 4 picioare");
    }

    @Override
    public void sound() {
        System.out.println("Face ham ham");
    }
}
