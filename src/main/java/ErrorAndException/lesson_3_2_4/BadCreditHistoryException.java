package ErrorAndException.lesson_3_2_4;

public class BadCreditHistoryException extends Exception{
    public BadCreditHistoryException(String message) {
        super(message);
    }
}
