package com.ua.vladtokarenko.homework30;
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbers("Thread 1", 10));
        Thread thread2 = new Thread(new PrintNumbers("Thread 2", 10));

        thread1.start();
        thread2.start();
    }
}
