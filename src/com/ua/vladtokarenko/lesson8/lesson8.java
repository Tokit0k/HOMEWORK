package com.ua.vladtokarenko.homework;

import java.util.Random;

public class lesson8 {
    public static void main(String[] args) {
        int length = 3;
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 1; i < length; i++) {
            arr[i] = random.nextInt(12);
            {
                System.out.println(arr[i] + " RandomNumber ");

            }
            System.out.print(getMinValue(arr) + " MinValue ");
            System.out.println(getMaxValue(arr) + " MaxValue ");
            System.out.println(getSumValue(arr) + " SumValue ");
            System.out.println(getAverageValue(arr) + " AverageValue ");

        }

    }

    static int getMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getSumValue(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double getAverageValue(int[] arr) {
        double sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}

