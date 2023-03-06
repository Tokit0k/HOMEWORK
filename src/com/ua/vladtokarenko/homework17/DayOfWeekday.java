package com.ua.vladtokarenko.homework17;

public enum DayOfWeekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    int dayNumber;

   public static DayOfWeekday getWeekday(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return DayOfWeekday.MONDAY;
            case 2:
                return DayOfWeekday.TUESDAY;
            case 3:
                return DayOfWeekday.WEDNESDAY;
            case 4:
                return DayOfWeekday.THURSDAY;
            case 5:
                return DayOfWeekday.FRIDAY;
            case 6:
                return DayOfWeekday.SATURDAY;
            case 7:
                return DayOfWeekday.SUNDAY;
            default: return null;
        }
    }
}

