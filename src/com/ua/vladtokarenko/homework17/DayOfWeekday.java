package com.ua.vladtokarenko.homework17;

public enum DayOfWeekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
     static DayOfWeekday numberDays(int number) {
         return switch (number) {
             case 1 -> MONDAY;
             case 2 -> TUESDAY;
             case 3 -> WEDNESDAY;
             case 4 -> THURSDAY;
             case 5 -> FRIDAY;
             case 6 -> SATURDAY;
             case 7 -> SUNDAY;
             default -> null;
         };
    }
}
