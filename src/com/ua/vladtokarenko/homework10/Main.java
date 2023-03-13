package com.ua.vladtokarenko.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Description student = new Description();
        student.setName("Vlad");
        student.setSurname("Tokarenko");
        student.setAge(27);
        System.out.println(student);
        Description teacher = new Description();
        teacher.setName("Oleksii");
        teacher.setSurname("Kapustnyk");
        teacher.setAge(28);
        System.out.println(teacher);
        System.out.println(" ");
        Description student2 = new Description();
        Array arr1 = new Array();
        System.out.println(Arrays.toString(arr1.generateArray(4)));
        System.out.println(Arrays.toString(arr1.sortArrayLeft(arr1.generateArray(3))));
        System.out.println(Arrays.toString(arr1.sortArrayRight(arr1.generateArray(6))));
    }

}