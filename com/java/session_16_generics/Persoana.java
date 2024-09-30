package session_16_generics;

import java.util.Objects;

public class Persoana {
    private String nume;
    private int age;
    //ce se intampla daca am si o adresa de tip Adresa???


    public Persoana(String name, int age) {
        this.nume = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //Verificam daca parametrul metodei este null
        if (o == null) {
            return false;
        }
        //Verificam daca referintele sunt egale
        if (o == this) {
            return true;
        }
        //Verificam tipul obiectului sa fie persoana
        if (!(o instanceof Persoana))
            return false;
        //Facem un cast de la Object la Persoana
        Persoana persoana = (Persoana) o;

        return persoana.age == this.age && Objects.equals(this.nume, persoana.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, age);
    }
}
