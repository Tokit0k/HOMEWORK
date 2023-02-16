package com.ua.vladtokarenko.homework12;

public class Child extends Parent {
    static {
        System.out.println("Child static block 1");
    }

    {
        System.out.println("Child block 1");
    }

    {
        System.out.println("Child block 2");
    }

    public Child() {
        System.out.println("Child constructor");
    }
}

