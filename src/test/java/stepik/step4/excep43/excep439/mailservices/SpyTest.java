package stepik.step4.excep43.excep439.mailservices;

import org.junit.Test;
import stepik.step4.excep43.excep439.packages.MailMessage;
import stepik.step4.excep43.excep439.packages.Sendable;

import static org.junit.Assert.*;

public class SpyTest {

    Sendable mail = new MailMessage("i", "you", "HI!");
    Sendable mailFromAustin = new MailMessage("Austin Powers", "Me", "Hi");
    Spy spy = new Spy();

    @Test
    public void spyLoggerCreateTest() {
       spy.processMail(mail);
    }

    @Test
    public void whenGetMessageFromAustin() {
       spy.processMail(mailFromAustin);
    }

}