package generics_collections.lesson_5_2_14;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String data = "Alexey 3000\nDmitry 9000\nAnton 3000\nAlexey 7000\nAnton 8000";
        StringReader reader = new StringReader(data);

        System.out.println(Market.getSalesMap(reader));
    }
}
