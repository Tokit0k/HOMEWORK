package com.ua.vladtokarenko.homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
        list.add(i);
        }
        System.out.println(list);
        System.out.println(" ");
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            list2.add(i);
        }
        List<Student> students = new LinkedList<>();
        students.add(new Student("Ivan", "Ivanov", 20, "A"));
        students.add(new Student("Petr", "Petrov", 21, "B"));
        students.add(new Student("Ivan", "Ivanov", 20, "A"));
        for (Student student : students) {
            System.out.println(student);

        }

    }


}
