package com.ua.vladtokarenko.homework15;

public class Pilot extends Persona implements Flying {
    public Pilot(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void fly() {
        System.out.println(getFirstName() + " " + getLastName() + " " + "I'm flying");
    }
}
