package com.example.task1_4_11;


public class Weekday {

    public static boolean isWeekend(String weekday) {
        if (weekday == "Monday") {
            return false;
        } else if (weekday == "Tuesday") {
            return false;
        } else if (weekday == "Wednesday") {
            return false;
        } else if (weekday == "Thursday") {
            return false;
        } else if (weekday == "Friday") {
            return false;
        } else if (weekday == "Saturday") {
            return true;
        } else if (weekday == "Sunday") {
            return true;
        }
        return false;
    }
}
