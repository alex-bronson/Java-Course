package files.lesson_4_4_9;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);

        // Создаем письма и посылки для тестов
        MailMessage mail1 = new MailMessage("John", "Paul", "Hello Paul");
        MailMessage mail2 = new MailMessage(AUSTIN_POWERS, "Dr. Evil", "Do you expect me to talk?");
        Package simplePackage = new Package("books", 30);
        Package expensivePackage = new Package("gold", 100);
        Package bannedPackage = new Package(WEAPONS, 500);
        Package stonesPackage = new Package("stones", 10);
        MailPackage mailPackage1 = new MailPackage("Alice", "Bob", simplePackage);
        MailPackage mailPackage2 = new MailPackage("Charlie", "Dave", expensivePackage);
        MailPackage mailPackage3 = new MailPackage("Eve", "Frank", bannedPackage);
        MailPackage mailPackage4 = new MailPackage("Grace", "Heidi", stonesPackage);

        // Создаем почтовые сервисы
        Spy spy = new Spy(logger);
        Thief thief = new Thief(50);
        Inspector inspector = new Inspector();

        // Проверяем работу UntrustworthyMailWorker
        MailService[] thirdParties = { spy, thief, inspector };
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(thirdParties);

        // Письма и посылки проходят через UntrustworthyMailWorker
        Sendable[] sendables = { mail1, mail2, mailPackage1, mailPackage2, mailPackage3, mailPackage4 };

        for (Sendable sendable : sendables) {
            try {
                worker.processMail(sendable);
            } catch (IllegalPackageException e) {
                System.out.println("Detected illegal package!");
            } catch (StolenPackageException e) {
                System.out.println("Detected stolen package!");
            }
        }

        // Проверяем сколько было украдено воришкой
        System.out.println("Total stolen value: " + thief.getStolenValue());

        // Проверяем работу RealMailService через UntrustworthyMailWorker
        RealMailService realMailService = worker.getRealMailService();
        for (Sendable sendable : sendables) {
            realMailService.processMail(sendable);
        }
    }
}
