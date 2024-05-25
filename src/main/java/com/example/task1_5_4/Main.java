package com.example.task1_5_4;

import com.example.task1_5_3.ArrayPrint;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 4;
        int end = 7;

        int[] result = ArrayBetween.getSubArrayBetween(arr, start, end);
        ArrayPrint.printArray(result);
    }
}
