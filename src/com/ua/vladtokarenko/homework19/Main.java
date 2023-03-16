package com.ua.vladtokarenko.homework19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(50) + 1;
            hashSet.add(randomNumber);
            treeSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}