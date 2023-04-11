package com.ua.vladtokarenko.homework26;

public class Main {
    public static int square(int number) throws NumberException {
        if (number < 0) {
            throw new NumberException("The number cannot be negative");
        }
        return number * number;
    }

    public static void main(String[] args) {
        try {
            int result = square(5);
            System.out.println("Result: " + result);

            int negativeResult = square(-5);
            System.out.println("Result: " + negativeResult);
        } catch (NumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
