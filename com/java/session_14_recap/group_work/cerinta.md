# Sistem de gestionare a bibliotecii

Creați un sistem simplu de gestionare a bibliotecii care să includă următoarele clase și funcționalități:

1. O clasă abstractă `Item` care să reprezinte un element din bibliotecă, cu proprietăți comune precum titlu și an de publicare.

2. Clase derivate `Carte` și `Revista` care să extindă clasa `Item` și să adauge proprietăți specifice (de exemplu, autor pentru cărți, număr de ediție pentru reviste).

3. O interfață `Imprumutabil` care să definească metode pentru împrumut și returnare.

4. O clasă `Biblioteca` care să gestioneze o colecție de `Item`-uri și să implementeze metode pentru adăugarea și eliminarea elementelor, precum și pentru căutarea după titlu sau autor.

5. Utilizați encapsularea pentru a proteja datele și polimorfismul pentru a trata diferite tipuri de `Item`-uri în mod uniform.

6. Implementați o metodă care să afișeze toate elementele disponibile în bibliotecă.

Bonus (dacă timpul permite):
- Adăugați o funcționalitate de împrumut care să țină evidența elementelor împrumutate și a datelor de returnare.