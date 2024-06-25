package ErrorAndException.lesson_3_1_5;

public class TestError {

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] el = new Exception().getStackTrace();

        if (el.length < 2) {
            return null;
        } else {
            return el[1].getClassName() + "#" + el[1].getMethodName();
        }
    }
}
