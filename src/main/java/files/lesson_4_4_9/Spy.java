package files.lesson_4_4_9;

import java.util.logging.Level;
import java.util.logging.Logger;

import static files.lesson_4_4_9.Main.AUSTIN_POWERS;

public class Spy implements MailService {
    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            String to = mailMessage.getTo();
            String message = mailMessage.getMessage();
            if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {
                logger.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
            } else {
                logger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[]{from, to});
            }
        }
        return mail;
    }
}
