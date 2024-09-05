package session_10_OOP_concepts;


public class Main {
    public static void main(String... args) throws InterruptedException {
        Alarm alarm = new Alarm("Temperature is to high");
//        System.out.println(alarm.active);
        alarm.turnOn();

        alarm.snooze();
//        System.out.println("----");
//        alarm.sendReport();
//        Thread.sleep(6000);
//        System.out.println(alarm.active);
        alarm.sendReport();

    }
}
