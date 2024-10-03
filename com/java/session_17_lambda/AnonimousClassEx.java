package session_17_lambda;

public class AnonimousClassEx {
    public static void main(String... args) {
        Animal animal = new Animal();
        animal.makeSound();


        //clasa anonima, in cazul asta va fi o clasa fara nume dar va reprezenta un caine
        Animal anonimAnimal = new Animal(){
            @Override
            public void makeSound() {
                System.out.println("ham ham");
            }
        };

        anonimAnimal.makeSound();


    }
}
