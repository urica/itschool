# Compoziție, Agregare și Asociere în Java

## 1. Asociere

**Definiție**: Asocierea este cea mai generală relație între două clase. Reprezintă o conexiune sau relație între clase, unde obiectele unei clase sunt conectate cu obiectele altei clase.

**Caracteristici**:
- Relație de tip "folosește un" sau "are un"
- Obiectele implicate au existență independentă
- Poate fi unidirecțională sau bidirecțională

**Exemplu în Java**:
```java
public class Student {
    private String nume;
    
    public void studiazaCurs(Curs curs) {
        // Studentul folosește un curs
    }
}

public class Curs {
    private String denumire;
}
```

În acest exemplu, `Student` are o asociere cu `Curs` prin metoda `studiazaCurs()`.

## 2. Agregare

**Definiție**: Agregarea este o formă specială de asociere care reprezintă o relație de tip "are un" între obiecte, unde un obiect poate exista independent de celălalt.

**Caracteristici**:
- Relație de tip "are un" mai puternică decât asocierea simplă
- Obiectul conținut poate exista independent de containerul său
- Adesea implementată folosind colecții (List, Set, etc.)

**Exemplu în Java**:
```java
import java.util.List;
import java.util.ArrayList;

public class Departament {
    private String nume;
    private List<Angajat> angajati;
    
    public Departament(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
    }
    
    public void adaugaAngajat(Angajat angajat) {
        angajati.add(angajat);
    }
}

public class Angajat {
    private String nume;
    
    public Angajat(String nume) {
        this.nume = nume;
    }
}
```

Aici, `Departament` agregă obiecte `Angajat`, dar un `Angajat` poate exista și fără a fi parte dintr-un `Departament`.

## 3. Compoziție

**Definiție**: Compoziția este o formă mai puternică de agregare, unde obiectul conținut nu poate exista independent de containerul său.

**Caracteristici**:
- Relație de tip "parte-întreg" sau "conține"
- Obiectul conținut nu poate exista fără containerul său
- Ciclul de viață al obiectului conținut este gestionat de container

**Exemplu în Java**:
```java
public class Motor {
    private String tip;
    
    public Motor(String tip) {
        this.tip = tip;
    }
}

public class Masina {
    private final Motor motor;
    
    public Masina() {
        this.motor = new Motor("V8"); // Motorul este creat odată cu Mașina
    }
    
    // Când Mașina este distrusă, Motorul este distrus automat
}
```

În acest exemplu, `Motor` este o parte integrantă a `Masina` și nu poate exista independent.

## Diferențe Cheie

1. **Cuplare**:
    - Asociere: Cuplare slabă
    - Agregare: Cuplare moderată
    - Compoziție: Cuplare puternică

2. **Durata de viață**:
    - Asociere: Obiecte independente
    - Agregare: Obiectul conținut poate supraviețui containerului
    - Compoziție: Obiectul conținut este distrus odată cu containerul

3. **Relație**:
    - Asociere: "folosește un"
    - Agregare: "are un" (slab)
    - Compoziție: "parte din" sau "conține" (puternic)

Înțelegerea acestor concepte este crucială pentru proiectarea eficientă a relațiilor dintre clase în programarea orientată pe obiecte.