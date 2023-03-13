package com.ua.vladtokarenko.homework17;

public enum DayOfWeekday {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
   final int  numberDays;
    DayOfWeekday(int numberDays) {
        this.numberDays = numberDays;
    }

    public int getNumberDays() {
        return numberDays;
    }
    static DayOfWeekday getWeekday(int dayNumber) {
        for (DayOfWeekday weekday : DayOfWeekday.values()) {
            if (weekday.getNumberDays() == dayNumber) {
                return weekday;
            }
        }
        return null;
    }
}
