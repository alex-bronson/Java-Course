package files.lesson_4_2_6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputAndOutput {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int count;

        while ((count = inputStream.read()) != -1) {
            if (count % 2 == 0) {
                outputStream.write(count);
            }
        }
    }
}
