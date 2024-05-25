package com.example.task1_5_6;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = inverseArray(arr);
        printArray(result);
    }

    public static int[] inverseArray(int[] numbers) {
        int[] result = new int[numbers.length];
//        result[0] = numbers[numbers.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];
        }
        return result;
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1] + "]");
    }
}
