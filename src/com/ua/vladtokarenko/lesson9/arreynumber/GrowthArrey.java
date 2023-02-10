package com.ua.vladtokarenko.lesson9.arreynumber;

import java.util.Random;

public class GrowthArrey {
    public int length;
    public int[] arr = new int[length];
    public int growArrey() {
        Random random = new Random();
        for (int i = 1; i < length; i++) {
            arr[i] = random.nextInt();


        }
        return arr[0];
    }


}
