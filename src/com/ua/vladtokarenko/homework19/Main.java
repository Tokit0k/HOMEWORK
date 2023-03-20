package com.ua.vladtokarenko.homework19;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створюємо мапу
        HashMap<String, String[]> map = new HashMap<>();

        // Додаємо слова та їх переклади
        map.put("кіт", new String[]{"cat", "猫", "Katze"});
        map.put("сонце", new String[]{"sun", "太陽", "Sonne"});
        map.put("дерево", new String[]{"tree", "木", "Baum"});
        map.put("вода", new String[]{"water", "水", "Wasser"});
        map.put("книга", new String[]{"book", "本", "Buch"});
        map.put("батько", new String[]{"father", "父", "Vater"});
        map.put("мати", new String[]{"mother", "母", "Mutter"});
        map.put("дім", new String[]{"house", "家", "Haus"});
        map.put("автомобіль", new String[]{"car", "車", "Auto"});
        map.put("програмування", new String[]{"programming", "プログラミング", "Programmierung"});

        // Зчитуємо користувацький ввід
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово: ");
        String word = scanner.nextLine();

        // Отримуємо переклади з мапи та виводимо їх на екран
        String[] translations = map.get(word);
        if (translations != null) {
            System.out.println("Англійська: " + translations[0]);
            System.out.println("Японська: " + translations[1]);
            System.out.println("Німецька: " + translations[2]);
        } else {
            System.out.println("Переклад для цього слова не знайдено");
        }
    }
}
