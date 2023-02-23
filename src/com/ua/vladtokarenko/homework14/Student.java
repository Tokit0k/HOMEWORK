package com.ua.vladtokarenko.homework14;

public class Student extends Person {
    private String group;
    private int yearOfStudy;

    public Student(String firstName, String lastName, int age, String gender, String group, int yearOfStudy) {
        super(firstName, lastName, age, gender);
        this.group = group;
        this.yearOfStudy = yearOfStudy;
    }

    public String getGroup() {
        return group;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String getRole() {
        return group + " is a student";
    }

}
