package com.ua.vladtokarenko.homework11;

public class Main {
    public static void main(String[] args) {
        Cargo car = new Cargo();
        car.setModel("BMW");
        car.setColor("red");
        car.setYear(2020);
        car.setLifting(1000);
        car.carReturn();
        Lightweight car2 = new Lightweight();
        car2.setModel("Audi");
        car2.setColor("black");
        car2.setYear(2017);
        car2.setLimitSpeed(250);
        car2.carReturn();


    }
}
