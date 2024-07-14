package files.lesson_4_2_6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[] input = {1, 2, 4, 10};
        ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        try (InputStream inputStream = new ByteArrayInputStream(input)){
            InputAndOutput.print(inputStream, outPut);
            byte[] outputBytes = outPut.toByteArray();
            for (byte b : outputBytes) {
                System.out.print(b + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
