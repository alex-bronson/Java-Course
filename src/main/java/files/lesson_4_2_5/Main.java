package files.lesson_4_2_5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        byte[] input = {1, 2, 4, 10};
        try (InputStream inputStream = new ByteArrayInputStream(input)){
            System.out.println("Sum: " + InputStreamTest.sumOfStream(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
