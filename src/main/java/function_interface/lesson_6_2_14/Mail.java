package function_interface.lesson_6_2_14;

public interface Mail<T> {
        String getFrom();
        String getTo();
        T getContent();
}
