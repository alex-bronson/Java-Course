package function_interface.lesson_6_2_14;

public class Salary implements Mail<Integer>{
    private final String from;
    private final String to;
    private final int salary;

    public Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}
