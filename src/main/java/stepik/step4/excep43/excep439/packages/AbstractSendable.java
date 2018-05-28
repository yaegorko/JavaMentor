package stepik.step4.excep43.excep439.packages;

import java.util.Objects;

/*
Абстрактный класс,который позволяет абстрагировать логику хранения
источника и получателя письма в соответствующих полях класса.
*/
public abstract class AbstractSendable implements Sendable {

    protected final String from;
    protected final String to;

    public AbstractSendable(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AbstractSendable that = (AbstractSendable) o;

        if (!from.equals(that.from)) {
            return false;
        }
        return to.equals(that.to);
    }

    @Override
    public int hashCode() {

        return Objects.hash(from, to);
    }
}

