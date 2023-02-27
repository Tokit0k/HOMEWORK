package com.ua.vladtokarenko.homework15;

public class Driver extends Persona implements Driving {
    String firstName;
    String lastName;

    public Driver(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void drive() {
        System.out.println(getFirstName() + " " + getLastName() + " " + "i'm Driver");
    }
}
