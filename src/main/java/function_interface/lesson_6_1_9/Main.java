package function_interface.lesson_6_1_9;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        UnaryOperator<Integer> square = sqrt();
        System.out.println(square.apply(5));
    }

    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }
}

