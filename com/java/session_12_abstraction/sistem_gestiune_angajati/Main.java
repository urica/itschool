package session_12_abstraction.sistem_gestiune_angajati;

public class Main {
    public static void main(String... args) {
        SoftwareDeveloper dev = new SoftwareDeveloper("Sam", 1001, 5000);
        ProjectManager pm = new ProjectManager("Ion", 2001, 7000);
        TechnicalLead tl = new TechnicalLead("Marius", 3001, 8500);

        dev.work();
        dev.learnNewTechnology();
        dev.writeCode();
        dev.debugCode();
        dev.displayInfo();

        pm.conductMeetings();
        pm.leadTeam();
        pm.work();
        pm.displayInfo();

        tl.conductMeetings();
        tl.work();
        tl.leadTeam();
        tl.displayInfo();
        tl.writeCode();
        tl.learnNewTechnology();
    }
}
