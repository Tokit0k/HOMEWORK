package com.ua.vladtokarenko.homework27;

import java.io.*;
import java.util.Scanner;

public class FileService {
    private static final String FILE_NAME = "data.txt";

    public static void saveToFile(String data) {
        try {
            File file = new File(FILE_NAME);
            FileWriter writer = new FileWriter(file, true);
            writer.write(data.replaceAll("\n", " ") + " ");
            writer.close();
            System.out.println();
            System.out.println("Строка збережена в файл");
        } catch (IOException e) {
            System.out.println("ой ой ой, не можу зберегти в файл");
            e.printStackTrace();
        }
    }

    public static String readFromFile() {
        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            StringBuilder data = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                data.append(line).append("\n");
            }
            scanner.close();
            return data.toString();
        } catch (IOException e) {
            System.out.println("ой ой ой, не можу зберегти в файл");
            e.printStackTrace();
            return "";
        }
    }

}

