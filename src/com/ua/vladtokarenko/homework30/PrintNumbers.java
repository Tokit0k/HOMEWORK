package com.ua.vladtokarenko.homework30;



class PrintNumbers implements Runnable {
    private String name;
    private int count;

    public PrintNumbers(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

