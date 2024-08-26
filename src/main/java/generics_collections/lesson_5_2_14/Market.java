package generics_collections.lesson_5_2_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Market {
    public static Map<String, Integer> getSalesMap(Reader reader) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        try (Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNextLine()) {
                String name = scanner.next();
                int sales = scanner.nextInt();

                map.put(name, map.getOrDefault(name, 0) + sales);
            }
        }
        return map;
    }
}
