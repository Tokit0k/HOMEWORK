package com.ua.vladtokarenko.homework11;

public class Lightweight extends Car {
    protected int loadcapacity;
    protected int weight;

    public int getLoadcapacity() {
        return loadcapacity;
    }

    public void setLoadcapacity(int loadcapacity) {
        this.loadcapacity = loadcapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  " model= " + model +
                " weight= " + weight +
                " color= " + color +
                " year= " + year +
                " loadcapacity=" + loadcapacity ;
    }
}
