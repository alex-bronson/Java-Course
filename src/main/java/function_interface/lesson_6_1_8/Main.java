package function_interface.lesson_6_1_8;

import java.util.function.UnaryOperator;

public class Main {

    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }

    public static void main(String[] args) {
        UnaryOperator<Integer> square = sqrt();
        System.out.println(square.apply(6));
    }
}
