package com.ua.vladtokarenko.homework11;

public class Car  {
    protected String model;
    protected String color;
    protected int year;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void carReturn() {
        System.out.println("Модель автомобиля: " + model + " год выпуска: " + this.year + " Цвет: " + this.color);
    }


}
