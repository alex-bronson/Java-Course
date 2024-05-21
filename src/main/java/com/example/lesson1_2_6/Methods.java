package com.example.lesson1_2_6;

public class Methods {
    public static void main(String[] args) {
        int monitors = 200;
        int programmers = 70;

        System.out.println(drawisMonitorsCounter(monitors, programmers));
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        if (monitors > programmers * 2) {
            return 0;
        }

        return monitors / programmers;
    }
}
