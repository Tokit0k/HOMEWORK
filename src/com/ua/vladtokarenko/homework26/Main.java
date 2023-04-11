package com.ua.vladtokarenko.homework26;

import java.util.Scanner;

public class Main {

    public static int square() throws NumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int numbers = scanner.nextInt();
        if (numbers < 0) {
            throw new NumberException("Чісло не може бути негативним");
        }
        return numbers * numbers;
    }

    public static void main(String[] args) {
        try {
            int result = square();
            System.out.println("Результат: " + result);

            int negativeResult = square();
            System.out.println("Результат: " + negativeResult);
        } catch (NumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
