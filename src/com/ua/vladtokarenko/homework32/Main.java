package com.ua.vladtokarenko.homework32;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Callable<Integer> randomGenerator = () -> {
            Random random = new Random();
            return random.nextInt(50) + 1;
        };
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executorService.submit(randomGenerator);
            System.out.println("Random number from thread " + (i + 1) + ": " + future.get());
        }
        executorService.shutdown();
    }
}
