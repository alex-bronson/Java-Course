package ErrorAndException.lesson_3_1_4;

public class FactorialCheck {
    public static void getFactorial(int num) throws MyNewException {
        if (num < 1) throw new MyNewException("Число меньше 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
