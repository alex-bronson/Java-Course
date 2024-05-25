package com.example.task1_4_12;


public class Weekday {

    public static boolean isWeekend(String weekday) {
            return (weekday == "Monday") ? false : (weekday == "Tuesday") ? false :
                    (weekday == "Wednesday") ? false : (weekday == "Thursday") ? false :
                            (weekday == "Friday") ? false : (weekday == "Saturday") ? true :
                                    (weekday == "Sunday") ? true : false;
    }
}
