package com.ua.vladtokarenko.homework11;

public class Lightweight extends Car{
    protected int limitSpeed;

    public int getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(int limitSpeed) {
        this.limitSpeed = limitSpeed;
    }

    @Override
    public void carReturn() {
        System.out.println(model + " " + color + " " + year + " " + limitSpeed + " Перевизначиний метод");
    }
}
