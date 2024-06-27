package ErrorAndException.lesson_3_2_4;

public class BankEmployee implements BankWorker{
    private String name;
    @Override
    public boolean checkClientForCredit(BankClient client) throws Exception {
        if (!client.isCredit()) throw new BadCreditHistoryException("Problem with credit history");
        if (!client.isLow()) throw new ProblemWithLawException("");
        return true;
    }
    public BankEmployee(String name) {
        this.name = name;
    }
}
