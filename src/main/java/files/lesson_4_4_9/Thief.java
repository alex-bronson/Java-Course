package files.lesson_4_4_9;

public class Thief implements MailService {
    private final int minPrice;
    private int stolenValue = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            Package content = mailPackage.getContent();
            if (content.getPrice() >= minPrice) {
                stolenValue += content.getPrice();
                Package fakePackage = new Package("stones instead of " + content.getContent(), 0);
                return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), fakePackage);
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return stolenValue;
    }
}
