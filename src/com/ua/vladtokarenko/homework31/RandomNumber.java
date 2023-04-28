package com.ua.vladtokarenko.homework31;

import java.util.Random;

public class RandomNumber extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int number;
        while (true) {
            number = random.nextInt(10) + 1;
            System.out.println(number);
            if (number == 5) {
                break;
            }
        }

    }
}
