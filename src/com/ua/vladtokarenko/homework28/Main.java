package com.ua.vladtokarenko.homework28;

import java.io.File;
import java.util.Scanner;
import static com.ua.vladtokarenko.homework28.FileService.readFromFileNIO;
import static com.ua.vladtokarenko.homework28.FileService.saveToFileNIO;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Напиши текст (або 'Вийти' щоб вийти ): ");
            String input = scanner.nextLine();
            if (input.equals("Вийти")) {
                break;
            }
            saveToFileNIO(input);
            String allData = readFromFileNIO();
            System.out.println("Строка в файлі ");
            System.out.println(allData);
        }
        scanner.close();


    }
}
