package com.ua.vladtokarenko.homework21;

public class Student {
    private final String surname;
    private final double averageGrade;
    private final int age;

    public Student(String surname, double averageGrade, int age) {
        this.surname = surname;
        this.averageGrade = averageGrade;
        this.age = age;
    }
    public String getSurname() {
        return surname;
    }
    public double getAverageGrade() {
        return averageGrade;
    }

    public int getAge() {
        return age;
    }
}
