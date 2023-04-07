package com.ua.vladtokarenko.homework25;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введіть число: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Помилка: введене значення не є цілим числом.");
                scanner.next();
            }
        }

        System.out.println("Ви ввели число: " + number);
    }
}

