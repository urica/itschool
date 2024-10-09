**Maven** este un instrument de **gestionare a proiectelor** și **automatizare a construcției** în principal utilizat pentru proiectele Java. Este folosit pentru a gestiona **dependințele** (biblioteci externe necesare pentru proiect), **compilarea codului**, **testarea** și **pachetarea** aplicațiilor.

### Ce este Maven?

Maven folosește un fișier de configurare numit `pom.xml` (Project Object Model), în care specifici detalii despre proiect (inclusiv versiuni, module, dependințe, pluginuri etc.). Scopul principal al Maven este să simplifice și să automatizeze procesul de **build**, **testare** și **distribuire** a aplicațiilor.

### La ce este bun Maven?

1. **Gestionarea dependințelor**: Maven îți permite să specifici ce biblioteci externe (dependințe) are nevoie proiectul tău, iar Maven le descarcă automat dintr-un repository central sau local. Nu mai trebuie să le adaugi manual.
2. **Automatizarea procesului de build**: Prin simpla rulare a unei comenzi (`mvn install` sau `mvn package`), Maven compilează, testează și pachetează codul într-un format de distribuție, cum ar fi un `.jar` sau `.war`.
3. **Structură standardizată a proiectelor**: Maven oferă o structură standardizată a directoarelor, ceea ce simplifică colaborarea în echipă și integrarea cu alte proiecte.
4. **Compatibilitate multiplatformă**: Maven funcționează pe toate platformele (Windows, macOS, Linux) fără modificări majore.
5. **Gestionarea fazelor de build**: Maven are un ciclu de viață bine definit pentru construirea proiectului, inclusiv fazele de **validare**, **compilare**, **testare**, **pachetare** și **distribuire**.

### Cum se folosește Maven?

1. **Instalare Maven**:
    - Maven trebuie instalat pe calculatorul tău. Poți descărca Maven de pe [site-ul oficial](https://maven.apache.org/download.cgi) și îl poți adăuga în variabila de mediu `PATH`.

2. **Crearea unui proiect Maven**:
   Poți crea un nou proiect Maven folosind comanda:
   ```bash
   mvn archetype:generate
   ```
   Aceasta comandă îți va genera o structură de bază pentru proiectul tău.

3. **Fișierul `pom.xml`**:
   Este cel mai important fișier dintr-un proiect Maven. Aici specifici toate dependințele și configurațiile pentru build. Exemplu simplu:

   ```xml
   <project xmlns="http://maven.apache.org/POM/4.0.0"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
           http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>

       <groupId>com.exemplu</groupId>
       <artifactId>proiect-maven</artifactId>
       <version>1.0-SNAPSHOT</version>

       <dependencies>
           <dependency>
               <groupId>junit</groupId>
               <artifactId>junit</artifactId>
               <version>4.13.1</version>
               <scope>test</scope>
           </dependency>
       </dependencies>
   </project>
   ```

4. **Comenzi Maven**:
    - **`mvn clean`**: Curăță fișierele generate în timpul build-ului anterior.
    - **`mvn compile`**: Compilează codul sursă.
    - **`mvn test`**: Rulează testele unitare specificate în proiect.
    - **`mvn package`**: Compilează, testează și creează un fișier `.jar` sau `.war`.
    - **`mvn install`**: Instalează pachetul în repository-ul local pentru a fi folosit de alte proiecte.

### Avantaje Maven:
- **Automatizare**: Automatizează aproape toate etapele procesului de build.
- **Portabilitate**: Proiectele pot fi clonate și rulate pe orice mediu cu o singură comandă.
- **Centralizare**: Gestionează dependențele și le descarcă automat.
- **Scalabilitate**: Suportă proiecte mari, multi-modul.

În concluzie, Maven este un instrument esențial în ecosistemul Java care simplifică gestionarea proiectelor și permite o dezvoltare mai rapidă și mai eficientă.

------------------------------------------------------------------------------------------------------------------------
---

### Instalarea Maven pe Windows și macOS se face în câțiva pași simpli:

---

## **Instalare Maven pe Windows:**

### 1. **Descarcă Maven:**
- Mergi pe site-ul oficial Apache Maven: [Maven Download](https://maven.apache.org/download.cgi).
- Alege varianta **"Binary zip archive"** și descarcă arhiva.

### 2. **Extrage fișierele:**
- După descărcare, extrage fișierele din arhivă într-un director pe care îl preferi, de exemplu: `C:\Program Files\Apache\Maven`.

### 3. **Configurează variabilele de mediu:**
- **Adaugă MAVEN_HOME**:
   1. Deschide meniul **Start** și caută **Environment Variables** (Variabile de mediu).
   2. În fereastra de **System Properties**, apasă pe **Environment Variables**.
   3. Sub **System variables**, apasă pe **New...** și creează o nouă variabilă:
      - **Name**: `MAVEN_HOME`
      - **Value**: Calea unde ai extras Maven, de exemplu: `C:\Program Files\Apache\Maven\apache-maven-3.x.x`

- **Adaugă Maven în `PATH`**:
   1. În lista **System variables**, selectează variabila `Path` și apasă **Edit**.
   2. Apasă pe **New** și adaugă calea către `bin` din folderul Maven, de exemplu: `C:\Program Files\Apache\Maven\apache-maven-3.x.x\bin`.

### 4. **Verifică instalarea:**
- Deschide o fereastră de **Command Prompt** și tastează comanda:
  ```bash
  mvn -version
  ```
- Dacă instalarea a fost corectă, vei vedea detalii despre versiunea Maven instalată.

---

## **Instalare Maven pe macOS:**

### 1. **Folosind Homebrew (recomandat):**

**Homebrew** este un manager de pachete pentru macOS care simplifică instalarea de software precum Maven.

- **Pasul 1**: Asigură-te că ai Homebrew instalat. Dacă nu, poți să-l instalezi rulând această comandă în Terminal:
  ```bash
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
  ```

- **Pasul 2**: După ce Homebrew este instalat, rulează comanda pentru a instala Maven:
  ```bash
  brew install maven
  ```

### 2. **Fără Homebrew (manual):**

- **Pasul 1**: Descarcă arhiva de pe [Maven Download](https://maven.apache.org/download.cgi).
- **Pasul 2**: Extrage fișierele din arhivă într-un folder de preferință, de exemplu: `/usr/local/apache-maven`.
- **Pasul 3**: Adaugă Maven în variabilele de mediu.
   - Deschide terminalul și editează fișierul `.bash_profile` sau `.zshrc` (în funcție de shell-ul tău):
     ```bash
     nano ~/.bash_profile
     ```
     sau
     ```bash
     nano ~/.zshrc
     ```

   - Adaugă următoarele linii:
     ```bash
     export MAVEN_HOME=/usr/local/apache-maven/apache-maven-3.x.x
     export PATH=$MAVEN_HOME/bin:$PATH
     ```

- **Pasul 4**: Salvează fișierul și încarcă modificările:
  ```bash
  source ~/.bash_profile
  ```
  sau
  ```bash
  source ~/.zshrc
  ```

### 3. **Verifică instalarea:**
- În terminal, rulează comanda:
  ```bash
  mvn -version
  ```
- Dacă instalarea a fost corectă, vei vedea informațiile despre versiunea Maven instalată.

---