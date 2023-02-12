package com.ua.vladtokarenko;

import java.util.Random;

public class Arrey {
    private int length;
    private int[] array;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void ArreyRandom(int length) {
        this.length = length;
        array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10);
        }

    }


}
