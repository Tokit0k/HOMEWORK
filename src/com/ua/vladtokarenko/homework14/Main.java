package com.ua.vladtokarenko.homework14;

public class Main {
    public static void main(String[] args) {
    Person student = new Student("Ivan", "Ivanov", 20, "male", "group1", 1);
    System.out.println(student.ToString());
    Person teacher = new Teacher("Petr", "Petrov", 30, "male", "mathematical", "Math");
    System.out.println(teacher.ToString());
    }
}