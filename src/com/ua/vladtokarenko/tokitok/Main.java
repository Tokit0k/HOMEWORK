package com.ua.vladtokarenko.tokitok;

public class Main {

    public static void Main(String[] args) {
        Girl girl = new Girl();
        girl.setName("Alina");
        girl.setSurname("Kolesnik");
        girl.setAge(23);
        girl.humanreturn();
        Man man = new Man();
        man.setName("Vlad");
        man.setSurname("Tok");
        man.setAge(26);
        man.humanreturn();


    }

}
