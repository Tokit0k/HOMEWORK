package com.ua.vladtokarenko.homework15;

public class Driver extends Persona implements Driving {
    public Driver(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void drive() {
        System.out.println(getFirstName() + " " + getLastName() + " " + "I'm driving");
    }
}
