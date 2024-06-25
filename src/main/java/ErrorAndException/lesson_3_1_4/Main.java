package ErrorAndException.lesson_3_1_4;

public class Main {
    public static void main(String[] args) {
        try {
            FactorialCheck.getFactorial(-5);
        } catch (MyNewException e) {
            System.out.println(e.getMessage());
        }
    }
}
