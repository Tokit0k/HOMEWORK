package com.ua.vladtokarenko.lesson9;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Vladislav";
        student1.surname = "Tokarenko";
        student1.age = 20;
        student1.room = "Robot_Dreams";
        System.out.println(student1.student());

        Teacher teacher1 = new Teacher();
        teacher1.name = "Oleksii";
        teacher1.surname = "Kapustnyk";
        teacher1.age = 27;
        teacher1.room = "Robot_Dreams";
        System.out.println(teacher1.teacher());
        System.out.println(" ");

        Arrey arrey1 = new Arrey();

        arrey1.lenght = 3;

        System.out.println(arrey1);
    }

}
