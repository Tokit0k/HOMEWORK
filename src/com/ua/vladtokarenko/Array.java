package com.ua.vladtokarenko;

import java.util.Random;

public class Array {
    private int length;
    private int[] arr;
    int i;
    int j;

    public Array(int length) {
        this.length = length;
        arr = new int[length];
        Random random = new Random();
        for (i = 0; i < length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }
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

    }
}
