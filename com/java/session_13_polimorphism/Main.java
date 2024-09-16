package session_13_polimorphism;

public class Main {
    public static void main(String... args) {
        Animal myAnimal = new Dog(); // Upcasting Dog -> Animal
//        myAnimal.makeSound();
//        myAnimal.sleep();

        Dog myDog = (Dog) myAnimal; // Downcasting Animal -> Dog

        myDog.makeSound(5);
//        myDog.fetch();
//        myDog.makeSound();

        doAnimalStuff(myDog);
        doAnimalStuff(new Cat());

        try {
            Cat myCat = (Cat) myAnimal;
            myCat.makeSound();
        } catch (ClassCastException ex) {
            System.out.println("Eroare: Nu putem face downcasting de la caine la pisica!");
        }
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeSound();

        if (animal instanceof Dog) {
            ((Dog) animal).fetch();
        } else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }
    }
}


//Clasa parinte / superclasa
class Animal {
    public void makeSound() {
        System.out.println("Generic sound");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}

//clasa derivata(subclasa)
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cainele face ham ham");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++)
            System.out.println("Cainele face ham ham");
    }

    public void fetch() {
        System.out.println("Cainele aduce mingea");
    }
}

//clasa derivata / clasa copil / subclasa
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Pisica face miau miau");
    }

    public void scratch() {
        System.out.println("Pisica zgarie");
    }
}


