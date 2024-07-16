package files.lesson_4_3_6;

import java.io.*;
import java.nio.charset.Charset;

public class ReadInputStream {
    public static void readAsString(InputStream inputStream, Charset charset) throws IOException {
        int count;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter writer = new StringWriter();
        while ((count = reader.read()) != -1) {
            writer.write(count);
        }
        System.out.println(writer);
    }
}
