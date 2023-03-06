package com.ua.vladtokarenko.homework10;

public class Description {
    private String name;
    private String surname;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return  " " + name +  " " + surname + " " + age;
    }
}
