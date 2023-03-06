package com.ua.vladtokarenko.homework14;

public class Teacher extends Person {
    final private String department;
    final private String speciality;

    public Teacher(String firstName, String lastName, int age, String gender, String department, String speciality) {
        super(firstName, lastName, age, gender);
        this.department = department;
        this.speciality = speciality;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String ToString() {
        return getFirstName() + " "
                + getLastName() + " "
                + getAge() + " "
                + getGender() + " "
                + getDepartment() + " "
                + getSpeciality() + " Учитель";
    }
}
