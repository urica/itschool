package session_12_abstraction.sistem_gestiune_angajati;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public void displayInfo() {
        System.out.println("Name: " + this.name + " ID: " + id + " salary: " + salary);
    }

    public String getName() {
        return name;
    }
}
