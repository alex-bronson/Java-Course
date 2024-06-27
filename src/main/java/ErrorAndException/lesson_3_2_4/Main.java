package ErrorAndException.lesson_3_2_4;

public class Main {
    public static void main(String[] args) {
        BankWorker worker = new BankEmployee("Alex");
        BankClient client = new BankClient(true, true);
        System.out.println(getCreditForClient(worker, client));
    }
    public static boolean getCreditForClient(BankWorker worker, BankClient client) {
        try {
            return worker.checkClientForCredit(client);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
