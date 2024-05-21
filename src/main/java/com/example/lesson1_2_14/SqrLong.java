package com.example.lesson1_2_14;
import java.math.BigInteger;


public class SqrLong {

    public static void main(String[] args) {
        maxLongSqr();
    }

    public static void maxLongSqr() {
        BigInteger max = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger sqr = max.multiply(max);

        System.out.println(sqr);
    }
}
