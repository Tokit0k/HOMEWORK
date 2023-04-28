package com.ua.vladtokarenko.homework30;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new PrintNumbers("Thread 1", 6));
        Thread thread2 = new Thread(new PrintNumbers("Thread 2", 7));
        Thread thread3 = new Thread(new PrintNumbers("Thread 3", 8));

        thread2.start();
        thread1.start();
        thread3.start();
    }
}
