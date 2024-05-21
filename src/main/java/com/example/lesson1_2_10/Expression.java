package com.example.lesson1_2_10;

public class Expression {
    public static void main(String[] args) {
        double a = 6;
        double b = 4;
        double c = 7;

        System.out.println(doubleExpression(a, b, c));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return a + b == c;
    }
}
