package files.lesson_4_3_6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        try {
            System.out.println(ReadInputStream.readAsString(inputStream, Charset.forName("ASCII")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
