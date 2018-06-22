package stepik.step6.stream.finalTask;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MailService<T> implements Consumer<Sendable> {

    Map<String, List<T>> mailBox;

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    public static void main(String[] args) {
        MailService mailService = new MailService();
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );
        mailService.accept(firstMessage);
    }

    public void accept(Sendable sendable) {
        T t = (T) sendable.getContent();
        String s = t.toString();
        List<T> contentList = Arrays.asList((T) s.chars().flatMap()toArray());
        //mailBox.put(sendable.getTo(), Arrays.asList(contentList));
        System.out.println(contentList);
    }
}
