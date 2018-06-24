package stepik.step6.stream.finaltask;

import java.util.Objects;

public abstract class SendableTemplate<T> implements Sendable<T> {

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

    public abstract T getContent();

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        SendableTemplate<?> that = (SendableTemplate<?>) o;
//        return Objects.equals(from, that.from)
//                && Objects.equals(to, that.to)
//                && Objects.equals(content, that.content);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(from, to, content);
//    }
}
