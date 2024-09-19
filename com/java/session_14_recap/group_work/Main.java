package session_14_recap.group_work;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Item {
    protected String titlu;
    protected int anPublicare;

    public Item(String titlu, int anPublicare) {
        this.titlu = titlu;
        this.anPublicare = anPublicare;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getAnPublicare() {
        return anPublicare;
    }

    abstract public String getDetalii();
}

interface Imprumutabil {
    void imprumuta(String numeCititor, LocalDate dataReturnare);

    void returneaza();

    boolean esteDisponibil();

    String getNumeCititor();

    LocalDate getDataReturnare();
}

class Carte extends Item implements Imprumutabil {
    private String autor;
    private boolean disponibil;
    private String numeCititor;
    private LocalDate dataReturnare;

    public Carte(String titlu, String autor, int anPublicare) {
        super(titlu, anPublicare);
        this.autor = autor;
        this.disponibil = true;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String getDetalii() {
        return "Carte: " + titlu + " de " + autor + " (" + anPublicare + ")";
    }

    @Override
    public void imprumuta(String numeCititor, LocalDate dataReturnare) {
        this.disponibil = false;
        this.numeCititor = numeCititor;
        this.dataReturnare = dataReturnare;
    }

    @Override
    public void returneaza() {
        this.disponibil = true;
        this.numeCititor = null;
        this.dataReturnare = null;
    }

    @Override
    public boolean esteDisponibil() {
        return disponibil;
    }

    @Override
    public String getNumeCititor() {
        return numeCititor;
    }

    @Override
    public LocalDate getDataReturnare() {
        return dataReturnare;
    }
}

class Revista extends Item implements Imprumutabil {
    private int numarEditie;
    private boolean disponibil;
    private String numeCititor;
    private LocalDate dataReturnare;

    public Revista(String titlu, int anPublicare, int numarEditie) {
        super(titlu, anPublicare);
        this.numarEditie = numarEditie;
        this.disponibil = true;
    }

    public int getNumarEditie() {
        return numarEditie;
    }

    @Override
    public String getDetalii() {
        return "Revista: " + titlu + " Nr. " + numarEditie + " (" + anPublicare + ")";
    }

    @Override
    public void imprumuta(String numeCititor, LocalDate dataReturnare) {
        this.disponibil = false;
        this.numeCititor = numeCititor;
        this.dataReturnare = dataReturnare;
    }

    @Override
    public void returneaza() {
        this.disponibil = true;
        this.numeCititor = null;
        this.dataReturnare = null;
    }

    @Override
    public boolean esteDisponibil() {
        return disponibil;
    }

    @Override
    public String getNumeCititor() {
        return numeCititor;
    }

    @Override
    public LocalDate getDataReturnare() {
        return dataReturnare;
    }
}

class Imprumut {
    private Imprumutabil item;
    private String numeCititor;
    private LocalDate dataImprumut;
    private LocalDate dataReturnare;

    public Imprumut(Imprumutabil item, String numeCititor, LocalDate dataReturnare) {
        this.item = item;
        this.numeCititor = numeCititor;
        this.dataImprumut = LocalDate.now();
        this.dataReturnare = dataReturnare;
    }

    public Imprumutabil getItem() {
        return item;
    }

    public String getNumeCititor() {
        return numeCititor;
    }

    public LocalDate getDataImprumut() {
        return dataImprumut;
    }

    public LocalDate getDataReturnare() {
        return dataReturnare;
    }

    @Override
    public String toString() {
        return "Împrumut: " + ((Item) item).getTitlu() + " de către " + numeCititor +
                " (Împrumutat: " + dataImprumut + ", Returnare: " + dataReturnare + ")";
    }
}

class Biblioteca {
    private List<Item> items;
    private List<Imprumut> imprumuturi;

    public Biblioteca() {
        this.items = new ArrayList<>();
        this.imprumuturi = new ArrayList<>();
    }

    public void adaugaItem(Item item) {
        items.add(item);
    }

    public void eliminaItem(Item item) {
        items.remove(item);
    }

    public Item cautaDupaTitlu(String titlu) {
        for (Item item : items) {
            if (item.getTitlu().equalsIgnoreCase(titlu)) {
                return item;
            }
        }
        return null;
    }

    public List<Item> cautaDupaAutor(String autor) {
        List<Item> rezultate = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Carte && ((Carte) item).getAutor().equalsIgnoreCase(autor)) {
                rezultate.add(item);
            }
        }
        return rezultate;
    }

    public void afiseazaToateElementele() {
        for (Item item : items) {
            System.out.println(item.getDetalii() + " - Disponibil: " +
                    (item instanceof Imprumutabil ? ((Imprumutabil) item).esteDisponibil() : "N/A"));
        }
    }

    public void imprumutaItem(Item item, String numeCititor, LocalDate dataReturnare) {
        if (item instanceof Imprumutabil) {
            Imprumutabil imprumutabil = (Imprumutabil) item;
            if (imprumutabil.esteDisponibil()) {
                imprumutabil.imprumuta(numeCititor, dataReturnare);
                imprumuturi.add(new Imprumut(imprumutabil, numeCititor, dataReturnare));
                System.out.println("Item împrumutat cu succes: " + item.getTitlu());
            } else {
                System.out.println("Item-ul nu este disponibil pentru împrumut: " + item.getTitlu());
            }
        } else {
            System.out.println("Acest item nu poate fi împrumutat: " + item.getTitlu());
        }
    }

    public void returneazaItem(Item item) {
        if (item instanceof Imprumutabil) {
            Imprumutabil imprumutabil = (Imprumutabil) item;
            if (!imprumutabil.esteDisponibil()) {
                imprumutabil.returneaza();
                imprumuturi.removeIf(imprumut -> imprumut.getItem() == imprumutabil);
                System.out.println("Item returnat cu succes: " + item.getTitlu());
            } else {
                System.out.println("Acest item nu a fost împrumutat: " + item.getTitlu());
            }
        } else {
            System.out.println("Acest item nu poate fi returnat: " + item.getTitlu());
        }
    }

    public void afiseazaImprumuturi() {
        if (imprumuturi.isEmpty()) {
            System.out.println("Nu există împrumuturi active.");
        } else {
            System.out.println("Împrumuturi active:");
            for (Imprumut imprumut : imprumuturi) {
                System.out.println(imprumut);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Carte carte1 = new Carte("Mândrie și prejudecată", "Jane Austen", 1813);
        Carte carte2 = new Carte("1984", "George Orwell", 1949);
        Revista revista1 = new Revista("National Geographic", 2023, 1);

        biblioteca.adaugaItem(carte1);
        biblioteca.adaugaItem(carte2);
        biblioteca.adaugaItem(revista1);

        System.out.println("Toate elementele din bibliotecă:");
        biblioteca.afiseazaToateElementele();

        System.out.println("\nÎmprumutarea cărții '1984':");
        biblioteca.imprumutaItem(carte2, "Ion Popescu", LocalDate.now().plusWeeks(2));

        System.out.println("\nÎmprumutarea revistei 'National Geographic':");
        biblioteca.imprumutaItem(revista1, "Maria Ionescu", LocalDate.now().plusWeeks(1));

        System.out.println("\nToate elementele după împrumut:");
        biblioteca.afiseazaToateElementele();

        System.out.println("\nAfișarea împrumuturilor active:");
        biblioteca.afiseazaImprumuturi();

        System.out.println("\nReturnarea cărții '1984':");
        biblioteca.returneazaItem(carte2);

        System.out.println("\nAfișarea împrumuturilor active după returnare:");
        biblioteca.afiseazaImprumuturi();
    }
}