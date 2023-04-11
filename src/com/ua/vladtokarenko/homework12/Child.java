package com.ua.vladtokarenko.homework12;

public class Child extends Parent {
    static {
        System.out.println("статичний дитини 2");
    }

    {
        System.out.println("блок дитини 6");
    }

    {
        System.out.println("блок дитини 7");
    }

    public Child() {
        System.out.println("конструктор дитини 8");
    }

}

