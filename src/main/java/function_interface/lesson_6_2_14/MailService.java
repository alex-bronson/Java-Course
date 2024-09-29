package function_interface.lesson_6_2_14;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Mail<T>> {
    private final Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(Mail<T> mail) {
        mailBox.computeIfAbsent(mail.getTo(), k -> new ArrayList<>()).add(mail.getContent());
    }
}
