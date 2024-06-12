package com.example.task1_5_10;

import java.util.Arrays;

public class ArraysCenter {

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length % 2 == 0) {
            int[] result = Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
            return result;
        } else {
            int[] result = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
            return result;
        }
    }
}
