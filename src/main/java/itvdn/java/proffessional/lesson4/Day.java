package itvdn.java.proffessional.lesson4;

public enum Day {
    MONDAY(8,7),
    TUESDAY(8,7),
    THURSDAY(8,7),
    FRIDAY(8,7),
    SATURDAY(8,7),
    SUNDAY(8,7);

    private final int  workingHour;
    private final int sleepHour;

    Day(int workingHour, int sleepHour) {
        this.workingHour = workingHour;
        this.sleepHour = sleepHour;
    }
}
