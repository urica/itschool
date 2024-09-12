package session_12_abstraction;

public abstract class Tetrapods implements Animal {
    private String name;
    private int members;

    public Tetrapods(String name, int members) {
        this.members = members;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    abstract void alearga();
}
