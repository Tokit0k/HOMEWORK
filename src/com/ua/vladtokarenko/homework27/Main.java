package com.ua.vladtokarenko.homework27;

import java.util.Scanner;

import static com.ua.vladtokarenko.homework27.FileService.readFromFile;
import static com.ua.vladtokarenko.homework27.FileService.saveToFile;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Напиши текст (або 'Вийти' щоб вийти ): ");
            String input = scanner.nextLine();
            if (input.equals("Вийти")) {
                break;
            }
            saveToFile(input);
            String allData = readFromFile();
            System.out.println("Строка в файлі ");
            System.out.println(allData);
        }
        scanner.close();
    }
}
