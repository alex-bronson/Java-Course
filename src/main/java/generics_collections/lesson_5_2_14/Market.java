package generics_collections.lesson_5_2_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Market {
    public static Map<String, Integer> getSalesMap(Reader reader) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split("\\s+");
            String name = parts[0];
            int sales = Integer.parseInt(parts[1]);

            map.put(name, map.getOrDefault(name, 0) + sales);
        }

        return map;
    }
}
