package function_interface.lesson_6_2_14;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailPackage<T>> {
    private Map<String, List<T>> mailBox;

    private Map<String, List<T>> getMailBoxInternal() {
        if (mailBox == null) {
            mailBox = new HashMap<>();
        }
        return mailBox;
    }

    @Override
    public void accept(MailPackage<T> mailPackage) {
        getMailBoxInternal()
                .computeIfAbsent(mailPackage.getTo(), k -> new ArrayList<>())
                .add(mailPackage.getContent());    }

    public Map<String, List<T>> getMailBox() {
        return Collections.unmodifiableMap(mailBox);
    }
}
