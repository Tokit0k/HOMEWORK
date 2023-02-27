package com.ua.vladtokarenko.homework15;

public class Pilot extends Persona implements Flying {
    @Override
    public void fly() {
        System.out.println("I'm Pilot");
    }

}
