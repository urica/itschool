package session_12_abstraction.sistem_gestiune_angajati;

public class TechnicalLead extends TechnicalEmployee implements ManagementSkills {

    public TechnicalLead(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void learnNewTechnology() {
        System.out.println(super.getName() + " learn new architectures for car development");
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "conducts technical teams and add value to system architecture");
    }

    @Override
    public void leadTeam() {
        System.out.println(super.getName() + " lead the team");
    }

    @Override
    public void conductMeetings() {
        System.out.println(super.getName() + " conduct meetings with team and clients");
    }

    @Override
    public void writeCode() {
        System.out.println(super.getName() + " write complex algorithms");
    }
}
