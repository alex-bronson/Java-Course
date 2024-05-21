package com.example.lesson1_3_8;

public class PowerOfTwo {

    public static void main(String[] args) {
        int a = 16;

        System.out.println(isPowerOfTwo1(a));
    }

    public static boolean isPowerOfTwo1(int a) {
        a = Math.abs(a);

        return Integer.bitCount(a) == 1;
    }
}
