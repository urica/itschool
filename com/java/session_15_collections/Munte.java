package session_15_collections;

public class Munte implements Comparable<Munte> {
    private String nume;
    private int inaltime;

    public Munte(String n, int i) {
        this.nume = n;
        this.inaltime = i;
    }

    public int getInaltime() {
        return inaltime;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public int compareTo(Munte o) {
        return Integer.compare(this.inaltime, o.inaltime);
    }

    @Override
    public String toString() {
        return nume + " (" + inaltime + "m)";
    }
}
