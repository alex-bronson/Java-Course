package files.lesson_4_2_5;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int byteRead;

        while ((byteRead = inputStream.read()) != -1) {
            byteRead = (byteRead <= 127) ? byteRead : byteRead - 256;
            sum += byteRead;
        }
        return sum;
    }
}
