package com.ua.vladtokarenko.homework15;

public class Persona {
    final private String firstName;
    final private String lastName;
    public Persona(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

