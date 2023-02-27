package com.ua.vladtokarenko.homework15;

public class Pilot extends Persona implements Flying {
    String firstName;
    String lastName;

    public Pilot(String firstName, String lastName) {
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
    public void fly() {
        System.out.println(getFirstName() + " " + getLastName() + " " + "I'm Pilot");
    }

}
