package files.lesson_4_2_6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[] input = { 10, 3, 50, 7, 20, -128, -127 };
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
