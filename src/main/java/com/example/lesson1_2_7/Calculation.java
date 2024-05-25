package com.example.lesson1_2_7;

public class Calculation {
    public static void main(String[] args) {
        double price = 24.5;
        int count = 8;

        System.out.println(priceCalculation(price, count));
    }

    public static double priceCalculation(double price, int count) {
        return price * count;
    }
}
