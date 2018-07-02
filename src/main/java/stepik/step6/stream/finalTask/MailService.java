package stepik.step6.stream.finaltask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable> {

    Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.get(key) == null ? new ArrayList<>() : super.get(key);
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    public void accept(Sendable sendable) {
        List<T> contentList = mailBox.get(sendable.getTo());
        contentList.add((T) sendable.getContent());
        mailBox.put(sendable.getTo(), contentList);
    }
}
