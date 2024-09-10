package function_interface.lesson_6_2_15;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorialStream(1));
    }

    public static BigInteger factorialStream(int value) {
        return IntStream.rangeClosed(1, value)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
