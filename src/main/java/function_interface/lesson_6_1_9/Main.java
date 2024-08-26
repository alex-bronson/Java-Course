package function_interface.lesson_6_1_9;

public class Main {
    public static void main(String[] args) {
        NumberGenerator<Number> generator = (NumberGenerator<Number>) NumberGenerator.getGenerator();
        System.out.println(generator.cond(-4));
    }
}
