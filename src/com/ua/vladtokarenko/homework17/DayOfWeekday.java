package com.ua.vladtokarenko.homework17;

public enum DayOfWeekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    int numbersDays;
    public int getNumbersDays() {
        return numbersDays;
    }
    public void setNumbersDays(int numbersDays) {
        this.numbersDays = numbersDays;
    }

    public static String getDayOfWeek(int i) {
        switch (i) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Більше намає днів";
        }
    }
}
