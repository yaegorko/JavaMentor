package stepik.step4.excep43.excep439.packages;

import java.util.Objects;

/*
Посылка, содержимое которой можно получить с помощью метода `getContent`
*/
public class MailPackage extends AbstractSendable {
    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        MailPackage that = (MailPackage) o;

        return content.equals(that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(content);
    }
}
