package com.example.task1_5_7;

import com.example.task1_5_3.ArrayPrint;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 3, 2};
        int[] arr2 = {4, 5, 3};

        int[] result = MergeArray.mergeAndSort(arr1, arr2);
        ArrayPrint.printArray(result);
    }
}
