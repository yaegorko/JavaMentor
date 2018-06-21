package stepik.step6.stream.finalTask;

public class SendableTemplate implements Sendable {

    String from;
    String to;

    public SendableTemplate(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
