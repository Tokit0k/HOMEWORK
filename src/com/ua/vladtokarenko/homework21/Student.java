package com.ua.vladtokarenko.homework21;

public class Student {
    private final String surname;
    private final double averageGrade;

    public Student(String surname, double averageGrade) {
        this.surname = surname;
        this.averageGrade = averageGrade;
    }
    public String getSurname() {
        return surname;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
}
