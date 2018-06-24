package stepik.step6.stream.finaltask;

public class MailMessage extends SendableTemplate<String> {

    String content;

    @Override
    public String getContent() {
        return this.content;
    }

    public MailMessage(String from, String to, String content) {
        super(from, to);
        this.content = content;
    }
}
