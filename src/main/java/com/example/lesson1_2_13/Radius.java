package com.example.lesson1_2_13;

public class Radius {

    public static void main(String[] args) {
        double area = 10;

        calcCircleRaduis(area);
    }

    public static void calcCircleRaduis(double area) {
        double x = Math.sqrt(area / Math.PI);

        System.out.println("R = %.3f" + x);
    }
}
