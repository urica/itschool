# Documentație: Sistem de Gestionare a Parcului de Distracții

## Structura Sistemului

Sistemul este compus din următoarele componente principale:

1. **Interfețe**:
    - `ElementParc`: Definește metode comune pentru toate elementele din parc.
    - `Mentenabil`: Specifică metode pentru elementele care necesită mentenanță.
    - `Facilitate`: Extinde `ElementParc` cu metode specifice facilităților.

2. **Clasă Abstractă**:
    - `Atractie`: Implementează `ElementParc` și `Mentenabil`, oferind o bază pentru toate atracțiile.

3. **Clase Concrete**:
    - `Rollercoaster` și `Carusel`: Extind `Atractie` cu funcționalități specifice.
    - `Restaurant`: Implementează `Facilitate`.

4. **Clasă de Gestionare**:
    - `ParcDistractii`: Gestionează toate atracțiile și facilitățile parcului.

5. **Clasă Principală**:
    - `SistemParcDistractii`: Conține metoda `main` pentru demonstrarea funcționalității.

## Rularea și Testarea Sistemului

Pentru a rula și testa sistemul:

1. Compilați toate clasele Java din proiect.
2. Rulați clasa `SistemParcDistractii` care conține metoda `main`.

```bash
javac *.java
java SistemParcDistractii
```

Clasa `SistemParcDistractii` va demonstra funcționalitățile principale ale sistemului, inclusiv:
- Crearea și adăugarea de atracții și facilități
- Simularea unei zile în parc (deschidere, utilizare atracții, mentenanță, închidere)

## Extinderea Sistemului

Pentru a adăuga noi tipuri de atracții sau facilități:

1. Pentru atracții noi:
    - Creați o nouă clasă care extinde `Atractie`
    - Implementați metodele abstracte și adăugați funcționalități specifice

2. Pentru facilități noi:
    - Creați o nouă clasă care implementează `Facilitate`
    - Implementați toate metodele necesare

3. În clasa `ParcDistractii`, adăugați logica necesară pentru gestionarea noilor elemente.

## Note Importante

- Asigurați-vă că respectați principiile SOLID în implementare.
- Utilizați moștenirea, polimorfismul și încapsularea în mod corespunzător.
- Adăugați comentarii relevante în cod pentru a explica logica și structura.

Pentru mai multe detalii, consultați codul sursă și comentariile asociate.