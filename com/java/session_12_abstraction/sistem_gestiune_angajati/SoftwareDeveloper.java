package session_12_abstraction.sistem_gestiune_angajati;

public class SoftwareDeveloper extends TechnicalEmployee {
    public SoftwareDeveloper(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void learnNewTechnology() {
        System.out.println(super.getName() + " learn activemq");
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " software developer");
    }

    @Override
    public void writeCode() {
        System.out.println(super.getName() + "write code and documentation");
    }
}
