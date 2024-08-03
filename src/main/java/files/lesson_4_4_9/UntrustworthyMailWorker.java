package files.lesson_4_4_9;

public class UntrustworthyMailWorker implements MailService {
    private final MailService[] mailServices;
    private final RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processedMail = mail;
        for (MailService mailService : mailServices) {
            processedMail = mailService.processMail(processedMail);
        }
        return realMailService.processMail(processedMail);
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }
}
