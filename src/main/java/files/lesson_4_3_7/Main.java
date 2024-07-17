package files.lesson_4_3_7;


import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double sum = 0.0;

        String input = scanner.nextLine();
        Scanner lineScanner = new Scanner(input);
        lineScanner.useLocale(Locale.ENGLISH);

        while (lineScanner.hasNext()) {
            String token = lineScanner.next();
            try {
                double number = Double.parseDouble(token);
                sum += number;
            } catch (NumberFormatException e) {

            }
        }

        System.out.printf(Locale.ENGLISH, "%.6f%n", sum);
        lineScanner.close();
        scanner.close();
    }
}
