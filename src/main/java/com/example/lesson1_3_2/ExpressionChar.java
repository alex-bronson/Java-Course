package com.example.lesson1_3_2;

public class ExpressionChar {

    public static void main(String[] args) {
        int a = 4;

        System.out.println(charExpression(a));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
