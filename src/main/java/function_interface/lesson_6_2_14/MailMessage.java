package function_interface.lesson_6_2_14;



public class MailMessage implements Mail<String> {
private final String from;
private final String to;
private final String message;

    public MailMessage(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
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
    public String getContent() {
        return message;
    }
}
