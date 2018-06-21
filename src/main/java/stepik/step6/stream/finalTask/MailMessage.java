package stepik.step6.stream.finalTask;

public class MailMessage extends SendableTemplate {

    String mailBody;

    public MailMessage(String from, String to, String mailBody) {
        super(from, to);
        this.mailBody = mailBody;
    }
}
