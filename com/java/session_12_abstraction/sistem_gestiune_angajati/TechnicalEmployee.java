package session_12_abstraction.sistem_gestiune_angajati;

public abstract class TechnicalEmployee extends Employee implements ProgrammingSkills {

    public TechnicalEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void debugCode() {
        System.out.println(super.getName() + "debugs code with advanced techniques!");
    }

    public abstract void learnNewTechnology();

}
