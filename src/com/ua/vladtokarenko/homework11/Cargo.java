package com.ua.vladtokarenko.homework11;

public class Cargo extends Car{
    protected int horsepower;

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "model= " + model +
                " color= " + color +
                " year= " + year +
                " horsepower=" + horsepower;
    }
}
