package session_12_abstraction;

// Interfață care definește comportamentul de bază pentru toate formele
interface Forma {
    double calculeazaArie();
    void afiseazaDetalii();
}

// Clasă abstractă care implementează parțial interfața Forma
abstract class FormaGeometrica implements Forma {
    protected String nume;

    public FormaGeometrica(String nume) {
        this.nume = nume;
    }

    // Implementare implicită pentru afiseazaDetalii
    @Override
    public void afiseazaDetalii() {
        System.out.println("Aceasta este o formă geometrică: " + nume);
        System.out.println("Aria: " + calculeazaArie());
    }

    // calculeazaArie rămâne abstractă și va fi implementată de subclase
}

// Subclasă concretă pentru Cerc
class Cerc extends FormaGeometrica {
    private double raza;

    public Cerc(double raza) {
        super("Cerc");
        this.raza = raza;
    }

    @Override
    public double calculeazaArie() {
        return Math.PI * raza * raza;
    }
}

// Subclasă concretă pentru Pătrat
class Patrat extends FormaGeometrica {
    private double latura;

    public Patrat(double latura) {
        super("Pătrat");
        this.latura = latura;
    }

    @Override
    public double calculeazaArie() {
        return latura * latura;
    }
}

// Clasa principală care demonstrează polimorfismul
public class DemoPolimorfism {
    public static void main(String[] args) {
        // Creăm un array de obiecte Forma
        Forma[] forme = new Forma[2];
        forme[0] = new Cerc(5);
        forme[1] = new Patrat(4);

        // Demonstrăm polimorfismul prin iterarea și apelarea metodelor
        for (Forma forma : forme) {
            forma.afiseazaDetalii();
            System.out.println(); // Linie goală pentru separare
        }
    }
}
