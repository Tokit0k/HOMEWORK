package com.ua.vladtokarenko.homework17;

public enum DayOfWeekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public static String numberDays(int number) {

        switch (number) {
            case 1:
                return MONDAY.name();
            case 2:
                return TUESDAY.name();
            case 3:
                return WEDNESDAY.name();
            case 4:
                return THURSDAY.name();
            case 5:
                return FRIDAY.name();
            case 6:
                return SATURDAY.name();
            default:
                return "Більше намає днів";
        }
    }
}
