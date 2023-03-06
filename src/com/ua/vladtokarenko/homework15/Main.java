package com.ua.vladtokarenko.homework15;

public class Main {
    public static void main(String[] args) {
        Flying person1 = new Pilot("Peter", "Parkers");
        person1.fly();
        Driving person2 = new Driver("Ivan", "Ivanov");
        person2.drive();
    }
}
