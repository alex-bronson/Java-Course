package com.example.task1_5_4;

public class ArrayBetween {

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int arrLength = 0;
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (start <= numbers[i] && numbers[i] <= end) {
                arrLength ++;
            }
        }
        int[] arr = new int[arrLength];

        for (int i = 0; i < numbers.length; i++) {
            if (start <= numbers[i] && numbers[i] <= end) {
                arr[j] = numbers[i];
                j++;
            }
        }

        return arr;
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1] + "]");
    }
}
