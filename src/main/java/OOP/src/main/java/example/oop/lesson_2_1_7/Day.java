package OOP.src.main.java.example.oop.lesson_2_1_7;

public enum Day {
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота"),
    SUNDAY ("Воскресенье");

    private String day;

    Day(String day) {
        this.day = day;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public String getRusName() {
        return day;
    }
}
