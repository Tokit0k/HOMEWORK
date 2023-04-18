package com.ua.vladtokarenko.homework27;

//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
//import java.util.Scanner;

public class FileService {
    static final String FILE_NAME = "data.txt";
//     static final String FILE_NAME2 = "data2.txt";


//    public static void saveToFile1(String data) {
//        try {
//            File file = new File(FILE_NAME);
//            FileWriter writer = new FileWriter(file, true);
//            writer.write(data.replaceAll("\n", " ") + " ");
//            writer.close();
//            System.out.println();
//            System.out.println("Строка збережена в файл");
//        } catch (IOException e) {
//            System.out.println("ой ой ой, не можу зберегти в файл");
//            e.printStackTrace();
//        }
//    }
    static void saveToFile(String data) {
        Path path = Path.of(FILE_NAME);
        try {
            data.replaceAll("\n", " ");
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
            System.out.println();
            System.out.println("Строка збережена в файл");
        } catch (IOException e) {
            System.out.println("ой ой ой, не можу зберегти в файл");
            e.printStackTrace();
        }
    }

//    public static String readFromFile1() {
//        try {
//            File file = new File(FILE_NAME);
//            Scanner scanner = new Scanner(file);
//            StringBuilder data = new StringBuilder();
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                data.append(line).append("\n");
//            }
//            scanner.close();
//            return data.toString();
//        } catch (IOException e) {
//            System.out.println("ой ой ой, не можу зберегти в файл");
//            e.printStackTrace();
//            return "";
//        }
//    }
    public static String readFromFile() {
        Path path = Path.of(FILE_NAME);
        try {
            byte[] data = Files.readAllBytes(path);
            return new String(data);

        } catch (IOException e) {
            System.out.println("ой ой ой, не можу зберегти в файл");
            e.printStackTrace();
            return "";
        }

    }

}

