package stepik.step6.stream.finaltask;

public class MailMessage extends SendableTemplate {

    String content;

    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
