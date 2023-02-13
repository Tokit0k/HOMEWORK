package com.ua.vladtokarenko.homework;

public class Main {
    public static void main(String[] args) {
        Description student = new Description();
        student.setName("Vlad");
        student.setSurname("Tokarenko");
        student.setAge(26);
        System.out.println(student);
        Description teacher = new Description();
        teacher.setName("Oleksii");
        teacher.setSurname("Kapustnyk");
        teacher.setAge(28);
        System.out.println(teacher);
        System.out.println(" ");
        Array arr = new Array();
        arr.arrRandom(5);
        Array arr2 = new Array();
        arr.arrSortMin(3);
    }
}