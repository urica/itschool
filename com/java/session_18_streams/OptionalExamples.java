package session_18_streams;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String... args) {
        Person person = getPersonByName("Ion");

        if (person != null)
            System.out.println("age: " + person.getAge());
        else
            System.out.println("age: " + 0);


        Optional<Person> optionalPerson = getOptionalPersonByName("Dana");
        if (optionalPerson.isPresent())
            System.out.println("age: " + optionalPerson.get().getAge());
        else
            System.out.println("age: " + 0);


        int age = optionalPerson.map(Person::getAge).orElse(0);
        System.out.println("age: " + age);

        Person pers = optionalPerson.orElseGet(() -> new Person("UNKNOWN", 0));
        System.out.println("Pers age: " + pers.getAge());

        //daca vrem exceptie cand nu este valoare do this
//        optionalPerson.orElseThrow()


    }

    public static Person getPersonByName(String name) {
//        return new Person(name, 25);
        return null;
    }

    public static Optional<Person> getOptionalPersonByName(String name) {
        return Optional.ofNullable(null);
    }

}
