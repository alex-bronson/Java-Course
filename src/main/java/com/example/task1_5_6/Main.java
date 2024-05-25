package com.example.task1_5_6;

import com.example.task1_5_3.ArrayPrint;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = ReverseArray.inverseArray(arr);
        ArrayPrint.printArray(result);
    }
}
