package com.ua.vladtokarenko.homework11;

public class Cargo extends Car {
    protected int lifting;

    public int getLifting() {
        return lifting;
    }

    public void setLifting(int lifting) {
        this.lifting = lifting;
    }

    @Override
    public void carReturn() {
        System.out.println(model + " " + color + " " + year + " " + lifting + " Перевизначиний метод");
    }
}
