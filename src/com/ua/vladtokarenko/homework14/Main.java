package com.ua.vladtokarenko.homework14;

public class Main {
    public static void main(String[] args) {


        Person student = new Student("Ivan", "Ivanov", 20, "male", "group1", 1);
        Person teacher = new Teacher("Petr", "Petrov", 30, "male", "12", "Math");
        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge() + " " + student.getGender() + " " + student.getRole());
        System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getAge() + " " + teacher.getGender() + " " + teacher.getRole());
    }
}