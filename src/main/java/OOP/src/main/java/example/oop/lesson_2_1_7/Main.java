package OOP.src.main.java.example.oop.lesson_2_1_7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        if (today.isWeekend()) {
            System.out.println("Сегодня выходной: " + today.getRusName());
        } else {
            System.out.println("Сегодня рабочий день: " + today.getRusName());
        }
    }
}
