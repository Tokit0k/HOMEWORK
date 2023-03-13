package com.ua.vladtokarenko.homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
        list.add(i);
        }
        System.out.println(list);
        System.out.println(" ");
        System.out.println(list.get(4));
        System.out.println(list.size());
        System.out.println(" ");
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 2000000; i++) {
            list2.add(i);
        }
        list2.remove(44);
        list2.add(1,122);
        System.out.println(list2.get(1));
        System.out.println(list2.size());
        System.out.println("");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivanov", 20, "A"));
        students.add(new Student("Petr", "Petrov", 21, "B"));
        students.add(new Student("Ivan", "Ivanov", 20, "A"));
        for (Student student : students) {
            System.out.println(student);

        }

    }


}
