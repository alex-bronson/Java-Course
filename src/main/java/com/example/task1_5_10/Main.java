package com.example.task1_5_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 12};

        int[] result = ArraysCenter.getArrayMiddle(arr);
        System.out.println(Arrays.toString(result));
    }
}
