package com.ua.vladtokarenko;

import java.util.Random;

public class Array {
    int i;
    public Array(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (i = 0; i < length; i++) {
            arr[i] = random.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] < arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
