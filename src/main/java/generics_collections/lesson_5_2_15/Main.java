package generics_collections.lesson_5_2_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        try (BufferedReader str = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = str.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if ((i & 1) != 0) {
                    list.addFirst(line[i]);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(list);
    }
}
