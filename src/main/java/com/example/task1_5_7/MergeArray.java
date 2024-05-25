package com.example.task1_5_7;


public class MergeArray {

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);

        for (int i = result.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (result[j] > result[j + 1]) {
                    int tmp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = tmp;
                }
            }
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
