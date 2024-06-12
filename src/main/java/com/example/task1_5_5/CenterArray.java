package com.example.task1_5_5;

public class CenterArray {

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length % 2 == 1) {
            int[] result = {numbers[numbers.length / 2]};
            return result;
        } else {
            int[] result = {numbers[(numbers.length / 2) - 1], numbers[numbers.length / 2]};
            return result;
        }
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1] + "]");
    }
}
