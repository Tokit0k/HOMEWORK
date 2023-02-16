package com.ua.vladtokarenko.homework12;
public class Parent {
    private String name;
    static {
        System.out.println("Parent static block 1");
    }

    {
        System.out.println("Parent block 1");
    }

    {
        System.out.println("Parent block 2");
    }
    public Parent() {
        System.out.println("Parent constructor");
    }
    public Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor 2");
    }
}


