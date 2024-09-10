package session_11_Encapsulation_vs_Inheritance;

public class Appliance {
    String brand = "Generic";

    Appliance() {
        System.out.println("Appliance is created");
    }

    void function() {
        System.out.println("Appliance is functioning");
    }
}

class Refrigerator extends Appliance {
    String brand = "Arctic";

    Refrigerator() {
        super();
        System.out.println("Refrigerator is created");
    }

    void function() {
        System.out.println("Refrigerator is cooling");
    }

    void work() {
        function();
        super.function();
    }

    void displayBrand() {
        System.out.println("Refrigerator brand: " + brand);
        System.out.println("Appliance brand: " + super.brand);
    }

}

class TestRefrigerator {
    public static void main(String... args) {
        Refrigerator ref = new Refrigerator();
        ref.displayBrand();
        ref.work();
    }
}
