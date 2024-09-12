# Sistem de Gestionare a Angajaților pentru o Companie de Tehnologie

## Obiectiv
Dezvoltați un sistem de gestionare a angajaților pentru o companie de tehnologie, utilizând principiile programării orientate pe obiecte în Java. Sistemul trebuie să modeleze diferite tipuri de angajați, responsabilitățile lor și structura ierarhică din cadrul companiei.

## Cerințe funcționale

1. Modelați următoarele tipuri de angajați:
    - Angajat (clasă de bază abstractă)
    - Angajat Tehnic (clasă abstractă derivată din Angajat)
    - Dezvoltator Software
    - Manager de Proiect
    - Lead Tehnic

2. Implementați următoarele interfețe:
    - Abilități de Programare
    - Abilități de Management

3. Fiecare clasă de angajat trebuie să aibă:
    - Atribute: nume, id, salariu
    - O metodă pentru afișarea informațiilor
    - O metodă abstractă sau concretă `work()` care descrie activitatea principală a angajatului

4. Clasa Angajat Tehnic trebuie să:
    - Implementeze interfața Abilități de Programare
    - Includă o metodă abstractă `learnNewTechnology()`

5. Dezvoltatorul Software și Lead-ul Tehnic trebuie să extindă clasa Angajat Tehnic

6. Managerul de Proiect și Lead-ul Tehnic trebuie să implementeze interfața Abilități de Management


## Cerințe tehnice

1. Utilizați moștenire pentru a stabili ierarhia claselor
2. Folosiți clase abstracte și interfețe pentru a defini comportamente comune și contracte
3. Implementați suprascrierea metodelor pentru a personaliza comportamentul claselor derivate
4. Asigurați-vă că codul respectă principiile encapsulării
5. Includeți comentarii relevante pentru a explica logica și structura codului

## Livrabile

1. Codul sursă Java pentru toate clasele și interfețele definite
2. O clasă `Main` care demonstrează crearea și utilizarea diferitelor tipuri de angajați
3. Documentație succintă care explică structura sistemului și deciziile de design

## Criterii de evaluare

1. Corectitudinea implementării conform cerințelor
2. Utilizarea adecvată a conceptelor de programare orientată pe obiecte
3. Claritatea și organizarea codului
4. Capacitatea sistemului de a fi extins cu ușurință pentru noi tipuri de angajați sau responsabilități