package com.ua.vladtokarenko;

import java.util.Arrays;
import java.util.Random;

public class Arrey {
    private int length;
    private int[] arr;
    private int i;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Arrey(int length) {
        this.length = length;
        arr = new int[length];
        Random random = new Random();
        for (i = 0; i < length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
    }

}





