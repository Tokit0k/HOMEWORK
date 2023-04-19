package com.ua.vladtokarenko.homework28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {
    static final String FILE_NAME2 = "data2.txt";

    static void saveToFileNIO(String data) {
        try {
            Path path = Path.of(FILE_NAME2);
            data.replaceAll("\n", " ");
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
            System.out.println();
            System.out.println("Строка збережена в файл");
        } catch (IOException e) {
            System.out.println("ой ой ой, не можу зберегти в файл");
            e.printStackTrace();
        }
    }


    public static String readFromFileNIO() {
        try {
            Path path = Path.of(FILE_NAME2);
            byte[] data = Files.readAllBytes(path);
            return new String(data);
        } catch (IOException e) {
            System.out.println("ой ой ой, не можу зберегти в файл");
            e.printStackTrace();
            return "";
        }

    }
}
