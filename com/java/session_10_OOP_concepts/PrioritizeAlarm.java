package session_10_OOP_concepts;

public non-sealed class PrioritizeAlarm extends Alarm {
    private int priority;

    public PrioritizeAlarm(String message, int priority) {
        super(message);
        this.priority = priority;
    }


    public int getPriority() {
        return priority;
    }

    public static void main(String... args) {
        PrioritizeAlarm alarm = new PrioritizeAlarm("Temperature is to high", 3);
        System.out.println(alarm.getPriority());
    }
}
