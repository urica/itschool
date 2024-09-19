# Cerință: Sistem de Gestionare a Parcului de Distracții

Dezvoltați un sistem de gestionare pentru un parc de distracții utilizând principiile programării orientate pe obiecte în Java. Sistemul trebuie să permită administrarea atracțiilor, facilităților și operațiunilor zilnice ale parcului.

## Structura sistemului

### 1. Interfețe

#### 1.1 `ElementParc`
- Metode:
    - `String getNume()`
    - `double getPret()`

#### 1.2 `Mentenabil`
- Metode:
    - `void efectueazaMentenanta()`
    - `boolean necesitaMentenanta()`

#### 1.3 `Facilitate` (extinde `ElementParc`)
- Metode adiționale:
    - `void deschide()`
    - `void inchide()`

### 2. Clasă abstractă

#### 2.1 `Atractie` (implementează `ElementParc` și `Mentenabil`)
- Câmpuri:
    - `protected String nume`
    - `protected double pret`
    - `protected int nivelUzura`
- Constructor:
    - `Atractie(String nume, double pret)`
- Metode abstracte:
    - `void foloseste()`
- Implementări:
    - Toate metodele din `ElementParc`
    - `boolean necesitaMentenanta()` din `Mentenabil`

### 3. Clase concrete

#### 3.1 `Rollercoaster` (extinde `Atractie`)
- Câmpuri adiționale:
    - `private int inaltimeMaxima`
- Constructor:
    - `Rollercoaster(String nume, double pret, int inaltimeMaxima)`
- Implementări:
    - `void foloseste()`
    - `void efectueazaMentenanta()`

#### 3.2 `Carusel` (extinde `Atractie`)
- Câmpuri adiționale:
    - `private int numarLocuri`
- Constructor:
    - `Carusel(String nume, double pret, int numarLocuri)`
- Implementări:
    - `void foloseste()`
    - `void efectueazaMentenanta()`

#### 3.3 `Restaurant` (implementează `Facilitate`)
- Câmpuri:
    - `private String nume`
    - `private double pretMediuMasa`
    - `private boolean deschis`
- Constructor:
    - `Restaurant(String nume, double pretMediuMasa)`
- Implementări:
    - Toate metodele din `Facilitate`

### 4. Clasă de gestionare

#### 4.1 `ParcDistractii`
- Câmpuri:
    - `private List<Atractie> atractii`
    - `private List<Facilitate> facilitati`
- Constructor:
    - `ParcDistractii()`
- Metode:
    - `void adaugaAtractie(Atractie atractie)`
    - `void adaugaFacilitate(Facilitate facilitate)`
    - `void deschideParc()`
    - `void inchideParc()`
    - `void efectueazaMentenantaGenerala()`
    - `void simuleazaZi()`

### 5. Clasă principală

#### 5.1 `SistemParcDistractii`
- Metoda `main` pentru demonstrarea funcționalității sistemului

## Cerințe funcționale

1. Sistemul trebuie să permită adăugarea și gestionarea mai multor tipuri de atracții (ex: Rollercoaster, Carusel).
2. Fiecare atracție trebuie să aibă un nivel de uzură care crește cu utilizarea.
3. Atracțiile trebuie să poată fi folosite și să necesite mentenanță bazată pe nivelul de uzură.
4. Sistemul trebuie să gestioneze facilități precum restaurante, care pot fi deschise și închise.
5. Parcul de distracții trebuie să poată simula o zi de funcționare, incluzând deschiderea, utilizarea atracțiilor, efectuarea mentenanței și închiderea.

## Cerințe non-funcționale

1. Codul trebuie să fie bine organizat și să respecte principiile SOLID.
2. Utilizați moștenirea, polimorfismul și încapsularea în mod corespunzător.
3. Codul trebuie să fie ușor de extins pentru adăugarea de noi tipuri de atracții sau facilități.
4. Includeți comentarii relevante pentru a explica logica și structura codului.

## Livrabile

1. Codul sursă Java complet pentru toate clasele și interfețele menționate.
2. O scurtă documentație explicând structura sistemului și cum poate fi rulat și testat.
3. Un exemplu de rulare în clasa `SistemParcDistractii` care demonstrează funcționalitățile principale ale sistemului.