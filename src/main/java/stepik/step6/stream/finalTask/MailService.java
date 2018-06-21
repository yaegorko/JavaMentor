package stepik.step6.stream.finalTask;

import java.util.List;
import java.util.Map;

public class MailService<T> {

    Map<String, List<T>> mailBox;

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

}
