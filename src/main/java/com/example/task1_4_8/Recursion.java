package com.example.task1_4_8;


import java.math.BigInteger;

public class Recursion {

    public static BigInteger recursionFactorial(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(n).multiply(recursionFactorial(n - 1));
        }
    }
}
