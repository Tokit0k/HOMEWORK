package com.ua.vladtokarenko.lesson9.arrey;

import java.util.Arrays;
import java.util.Random;


public class Arreys {
    public int length;
    public int[] arr;
    public int i;


    public Arreys(int length) {
        this.length = length;
        arr = new int[length];
        Random random = new Random();
        for (i = 0; i < length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
    }

    public String ArreysSortAscendingm() {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public String ArreysSortDescendingm() {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }

            }

        }
        return Arrays.toString(arr);
    }
}