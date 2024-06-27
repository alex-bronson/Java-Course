package ErrorAndException.lesson_3_2_4;

public interface BankWorker {
    public boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, Exception;
}
