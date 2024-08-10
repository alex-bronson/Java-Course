package generics_collections.lesson_5_2_14;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String data = "Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000";
        StringReader reader = new StringReader(data);

        System.out.println(Market.getSalesMap(reader));
    }
}
