package com.ua.vladtokarenko.homework23;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        List<String> surnames = asList("Tokarenko", "Vlasov", "Krupskii", "Petrov", "Andreich", "Tokarenko", "Vlasov", "Ivanovich", "Petrov", "Andreich", "Tokarenko", "Vlasov", "Kramar", "Petrov", "Antonov", "Tokarenko", "Vlasov", "Ivanovich", "Ivanov", "Andreich");
        Map<String, Long> surnameCountMap = surnames.stream()
                .collect(Collectors.groupingBy(surname -> surname, Collectors.counting()));
        System.out.println("Кількість повторень прізвищ:");
        System.out.println(surnameCountMap);
        System.out.println("");

        List<Integer> numbers = new Random().ints(10, 0, 21).boxed().toList();
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(numbers);
        System.out.println("Сума випадкових чисел: " + sum);
    }
}
