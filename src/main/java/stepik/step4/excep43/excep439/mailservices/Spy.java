package stepik.step4.excep43.excep439.mailservices;

import stepik.step4.excep43.excep439.packages.MailMessage;
import stepik.step4.excep43.excep439.packages.Sendable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {

    public static final String AUSTIN_POWERS = "Austin Powers";

    Logger spyLogger;

    public Spy(Logger logger) {
        this.spyLogger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        this.spyLogger.setLevel(Level.INFO);
        if (mail.getClass() == MailMessage.class && (mail.getFrom() == AUSTIN_POWERS || mail.getTo() == AUSTIN_POWERS)) {
            spyLogger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", new String[]{mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
        } else if (mail.getClass() == MailMessage.class) {
            spyLogger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new String[]{mail.getFrom(), mail.getTo()});
        }
        return mail;
    }
}
