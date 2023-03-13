package com.ua.vladtokarenko.homework14;

public class Teacher extends Person {
    private String department;
    private String speciality;

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

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
