package session_13_polimorphism;

// Creează un program Java care implementează un sistem de procesare a plăților. Programul trebuie să suporte următoarele tipuri de plăți:

// Plăți cu cardul de credit
// Plăți cu cardul de debit
// Transferuri bancare
// Plăți cu criptomonede
// Toate aceste tipuri de plăți trebuie să fie gestionate polimorfic printr-o interfață comună Payment, care definește metodele:

// processPayment(double amount) – procesează plata unei sume.
// showTransactionDetails() – afișează detaliile tranzacției.

// Implementează diferite clase concrete pentru fiecare tip de plată, fiecare cu comportamentul specific pentru metoda processPayment.
// În metoda principală (main), creează instanțe pentru fiecare tip de plată, procesează o sumă de bani și afișează detaliile
// tranzacției pentru fiecare plată.


//Interfata Payment defineste comportamentele comune pentru toate tipurile de plati
interface Payment {
    void processPayment(double amount); //o metoda abstracta pentru procesarea platilor

    void showTransactionDetails();
}

abstract class CardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;

    public CardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void showTransactionDetails() {
        System.out.println("Plata realizata cu cardul: " + cardHolderName + " (Card: " + maskCardNumber() + ")");
    }

    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
}

class CreditCardPayment extends CardPayment {
    public CreditCardPayment(String cartNumber, String cardHolderName) {
        super(cartNumber, cardHolderName);
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("Procesare plata card credit de: " + amount + " pentru " + super.getCardHolderName());
    }
}

class DebitCardPayment extends CardPayment {
    public DebitCardPayment(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Procesare plata card debit de: " + amount + " pentru " + super.getCardHolderName());
    }
}

class BankTransfer implements Payment {
    private String iban;
    private String bankName;

    public BankTransfer(String iban, String bankName) {
        this.iban = iban;
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Transfer bancar de " + amount + " catre IBAN-ul: " + iban + " la banca " + bankName);
    }

    @Override
    public void showTransactionDetails() {
        System.out.println("Detalii transfer bancar: IBAN " + iban + ", Banca: " + bankName);
    }
}

class CryptoPayment implements Payment {
    private String walletAddress;
    private String cryptoType;

    public CryptoPayment(String walletAddress, String cryptoType) {
        this.cryptoType = cryptoType;
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Plata de " + amount + " " + cryptoType + " catre adresa: " + walletAddress);
    }

    @Override
    public void showTransactionDetails() {
        System.out.println("Detalii plata crypto: " + cryptoType + ", Wallet: " + walletAddress);
    }
}

public class PaymentSystem {
    public static void main(String... args) {
        Payment creditCArd = new CreditCardPayment("1234567812345678", "Ion Popescu");
        Payment debitCard = new DebitCardPayment("8765432187654321", "Maria Ionescu");
        Payment bankTransfer = new BankTransfer("RO79BTRLRONCRT746624572412", "BT");
        Payment cryptoPaymnet = new CryptoPayment("ff34g1114hGrtH54h2thgbqertgq5", "Bitcon");


        Payment[] payments = {creditCArd, debitCard, bankTransfer, cryptoPaymnet};

        for (Payment p : payments) {
            p.processPayment(100.0);
            p.showTransactionDetails();
            System.out.println();
        }

    }
}
