package com.example.lesson1_3_3;

public class AgeSum {

    public static void main(String[] args) {
        byte a = 22;
        byte b = 29;
        
        System.out.println(getAgeDiff(a, b));
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs((age1 - age2));
    }
}
