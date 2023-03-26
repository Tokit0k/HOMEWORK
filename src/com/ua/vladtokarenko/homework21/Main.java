package com.ua.vladtokarenko.homework21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tokarenko", 5.0));
        students.add(new Student("Vlasov", 4.5));
        students.add(new Student("Ankura", 2.5));
        students.add(new Student("Ivanov", 4.5));
        students.add(new Student("Petrov", 1.0));

        System.out.println("Original list:");
        for (Student student : students) {
            System.out.println(student.getSurname() + " " + student.getAverageGrade());
        }

        Comparator<Student> bySurname = Comparator.comparing(Student::getSurname);
        students.sort(bySurname);
        System.out.println(" ");
        System.out.println("List bySurname:");
        for (Student student : students) {
            System.out.println(student.getSurname() + " " + student.getAverageGrade());
        }
        System.out.println(" ");
        Comparator<Student> byAverageGrade = Comparator.comparingDouble(Student::getAverageGrade);
        students.sort(byAverageGrade);

        System.out.println("List byAverageGrade:");
        for (Student student : students) {
            System.out.println(student.getSurname() + " " + student.getAverageGrade());
        }
    }

}

