package com.ua.vladtokarenko.homework20;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String[]> map = new HashMap<>();
        map.put("Учень", new String[]{"Student", "学生", "Schüler"});
        map.put("Викладач", new String[]{"Teacher", "教師", "Lehrer"});
        map.put("Повар", new String[]{"Cook", "厨師", "Koch"});
        map.put("Програміст", new String[]{"Programmer", "程序员", "Programmierer"});
        map.put("Менеджер", new String[]{"Manager", "经理", "Manager"});
        map.put("Автомобіль", new String[]{"Car", "车", "Auto"});
        map.put("Війна", new String[]{"War", "战争", "Welt"});
        map.put("Мастер", new String[]{"Master", "大师", "Herr"});
        map.put("Великий", new String[]{"Big", "大", "Groß"});
        map.put("Малий", new String[]{"Small", "小", "Klein"});

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть слово: ");
            String word = scanner.nextLine();
            if (word.equals("Кінець")) {
                break;
            }

            String[] translations = map.get(word);
            if (translations != null) {
                System.out.println("Англійська: " + translations[0]);
                System.out.println("Японська: " + translations[1]);
                System.out.println("Німецька: " + translations[2]);
            }
            else  {
                System.out.println("Переклад для цього слова не знайдено");
            }
        }
    }
}