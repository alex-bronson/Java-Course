package function_interface.lesson_6_1_9;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);

    static NumberGenerator<? super Number> getGenerator() {
        return (Number x) -> x.intValue() > 0;
    }
}
