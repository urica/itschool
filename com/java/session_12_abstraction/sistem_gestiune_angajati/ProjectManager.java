package session_12_abstraction.sistem_gestiune_angajati;

public class ProjectManager extends Employee implements ManagementSkills {
    public ProjectManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " works with projects and resources");
    }

    @Override
    public void leadTeam() {
        System.out.println(super.getName() + " coordinate teams");
    }

    @Override
    public void conductMeetings() {
        System.out.println(super.getName() + " organize meetings");
    }
}
