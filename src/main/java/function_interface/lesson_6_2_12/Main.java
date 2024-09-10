package function_interface.lesson_6_2_12;

import java.util.Comparator;
import java.util.stream.Stream;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 5, 1, 9, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        BiConsumer<Integer, Integer> MinMaxConsumer = (min, max) -> {
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        };
        findMinMax(stream, comparator, MinMaxConsumer);
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T[] minMax = (T[]) new Object[2];

        stream.forEach(element -> {
            if (minMax[0] == null || order.compare(element, minMax[0]) < 0) {
                minMax[0] = element;
            }
            if (minMax[1] == null || order.compare(element, minMax[1]) > 0) {
                minMax[1] = element;
            }
        });

        if (minMax[0] == null && minMax[1] == null) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(minMax[0], minMax[1]);
        }
    }
}

