package function_interface.lesson_6_1_8;

public class Main {
    public static void main(String[] args) {
        UnaryOperator test = x -> x * x;
        System.out.println(test.sqrt(5));
    }
}
