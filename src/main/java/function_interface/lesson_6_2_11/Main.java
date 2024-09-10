package function_interface.lesson_6_2_11;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        pseudoRandomStream(13).limit(10)
                .mapToObj(x -> " " + x)
                .forEachOrdered(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }
}
