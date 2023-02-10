package com.ua.vladtokarenko.lesson9;

import java.util.Random;

public class Arrey {
    int lenght;
    int[] arr;
    Random random = new Random();

    public void arreys() {
        int i;
        for (i = 0; i < lenght; i++) {
            arr[i] = random.nextInt(5);
        }
        System.out.println(arr[i]);

    }

}

