package com.ua.vladtokarenko.lesson9.arreynumber;
public class Main {
    public static void main(String[] args) {
        GrowthArrey gArrey = new GrowthArrey();
        gArrey.length = 3;
        gArrey.arr  = new int[gArrey.length];
        System.out.println(gArrey.growArrey());
    }
}