package com.ua.vladtokarenko.tokitok;

public class Human {
   private String name;
   private String surname;
   private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void humanreturn(){
        System.out.println("Ваше имя: " + name + " Ваша фамилия: " + surname + " Ваш возраст: " + age);
    }

}
