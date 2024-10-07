package session_18_streams;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> hobbies;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
