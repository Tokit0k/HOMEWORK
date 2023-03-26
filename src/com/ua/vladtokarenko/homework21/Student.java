package com.ua.vladtokarenko.homework21;

public class Student {
    private String surname;
    private double averageGrade;

    public Student(String surname, double averageGrade) {
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

}
