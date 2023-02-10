package com.ua.vladtokarenko.lesson9.arreynumber;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 1; i < length; i++) {
            arr[i] = random.nextInt(9);

        }
        Arrays.sort(arr);
        for (int arr1 : arr) {
            System.out.println(arr1);

        }
    }
}