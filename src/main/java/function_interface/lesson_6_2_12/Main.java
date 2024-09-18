package function_interface.lesson_6_2_12;


import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<? extends T> list = stream.collect(Collectors.toList());

        if (!list.isEmpty()) {
            T min = list.stream().min(order).get();
            T max = list.stream().max(order).get();
            minMaxConsumer.accept(min, max);
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}

