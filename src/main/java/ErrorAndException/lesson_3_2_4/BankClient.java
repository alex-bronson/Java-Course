package ErrorAndException.lesson_3_2_4;

public class BankClient {
    private boolean isCredit;
    private boolean isLow;

    public BankClient(boolean isCredit, boolean isLow) {
        this.isCredit = isCredit;
        this.isLow = isLow;
    }

    public boolean isCredit() {
        return isCredit;
    }

    public boolean isLow() {
        return isLow;
    }
}
