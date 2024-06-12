package com.example.task1_4_10;


public class Weekday {

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Monday":
                return false;
            case "Tuesday":
                return false;
            case "Wednesday":
                return false;
            case "Thursday":
                return false;
            case "Friday":
                return false;
            case "Saturday":
                return true;
            case "Sunday":
                return true;
        }
        return false;
    }
}
