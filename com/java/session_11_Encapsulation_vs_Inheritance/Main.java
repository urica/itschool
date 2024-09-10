package session_11_Encapsulation_vs_Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);

        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        person.setAge(-20);

    }
}

