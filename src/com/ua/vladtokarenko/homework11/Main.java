package com.ua.vladtokarenko.homework11;

public class Main {
    public static void main(String[] args) {
        Lightweight car = new Lightweight();
        car.setModel("Toyota");
        car.setColor("Red");
        car.setYear(1984);
        car.setLoadcapacity(100);
        car.setWeight(1500);
        System.out.println(car);
        Cargo car1 = new Cargo();
        car1.setModel("Audi");
        car1.setColor("Green");
        car1.setYear(2004);
        car1.setHorsepower(20000);
        System.out.println(car1);

    }
}