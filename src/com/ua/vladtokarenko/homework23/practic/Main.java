package com.ua.vladtokarenko.homework23.practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(10, 1, 15).boxed().toList();
        System.out.println(list);
        int sum = new Random().ints(20, 1, 100).sum();
        System.out.println();
        System.out.println(sum);







    }
}
