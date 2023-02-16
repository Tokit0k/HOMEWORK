package com.ua.vladtokarenko.homework12;

public class Parent {
    private String name;

    static {
        System.out.println("статичний батька 1");
    }

    {
        System.out.println("блок батька 3");
    }

    {
        System.out.println("блок батька 4");
    }

    public Parent() {
        System.out.println("конструктор батька 5");
    }
}


