package com.example.lesson1_4_7;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}