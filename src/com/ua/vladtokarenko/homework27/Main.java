package com.ua.vladtokarenko.homework27;

import java.io.BufferedReader;
import java.io.IOException;
//import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static com.ua.vladtokarenko.homework27.FileService.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedReader reader = Files.newBufferedReader(Path.of(FILE_NAME2))) {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        while (true) {
//            System.out.println("Напиши текст (або 'Вийти' щоб вийти ): ");
//            String input = scanner.nextLine();
//            if (input.equals("Вийти")) {
//                break;
//            }
//            saveToFile(input);
//            String allData = readFromFile();
//            System.out.println("Строка в файлі ");
//            System.out.println(allData);
//        }
//        scanner.close();
//    }
//
    }
}