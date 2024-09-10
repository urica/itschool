package session_10_OOP_concepts;

public final class HighVisibilityAlarm extends Alarm {

    public HighVisibilityAlarm(String message) {
        super(message);
    }

    @Override
    public String getReport(boolean toUppercase) {
//        if (isActive() && !isSnoozing()) {
//            if (toUppercase)
//                return getMessage().toUpperCase() + "!";
//            else
//                return getMessage() + "!";
//        } else
//            return "";

        String report = super.getReport(toUppercase);
        if (report.isEmpty())
            return report;
        else
            return report + "!";
    }

    public static void main(String... args) {
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("Temperature is to high");
        alarm.turnOn();
//        System.out.println(alarm.getReport(true));

        alarm.sendReport();
        alarm.turnOff();
        alarm.sendReport();

    }


}
