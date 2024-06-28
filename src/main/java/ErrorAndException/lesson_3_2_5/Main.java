package ErrorAndException.lesson_3_2_5;

public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            drive();
        }
    }
    private static void drive() {
        System.out.println("Машина поехала.");
    }
    public static class Car implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("Машина закрывается...");
        }

    }
}
