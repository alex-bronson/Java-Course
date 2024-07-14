package files.lesson_4_2_5;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int counter;

        while ((counter = inputStream.read()) != -1) {
            sum += counter;
        }
        return sum;
    }
}
