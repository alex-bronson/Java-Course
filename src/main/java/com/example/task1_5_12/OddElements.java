package com.example.task1_5_12;

public class OddElements {
    public static void printOddNumbers(int[] arr) {
        boolean isFirst = true;
        for (int elem : arr) {
            if (elem % 2 != 1) {
                if (!isFirst) {
                    System.out.print(", ");
                }
                System.out.print(elem);
                isFirst = false;
            }
        }
        System.out.println();
    }
}
