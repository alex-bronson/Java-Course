package generics_collections.lesson_5_1_14;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] arr = (T[]) new Object[3];
    private int size = 0;

    public void add(T el) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length + 3);
        }
        arr[size++] = el;
    }

    public void remove(int index) {

    }

    public T get(int index) {
        return (T) arr;
    }
}
