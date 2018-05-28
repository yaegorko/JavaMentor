package stepik.step4.excep43.excep439.mailservices;

import org.junit.Test;
import stepik.step4.excep43.excep439.packages.MailPackage;
import stepik.step4.excep43.excep439.packages.Package;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ThiefTest {
    Thief thief = new Thief(100000);
    Package expensivePackage = new Package("gold", 120000);
    MailPackage mailPackage = new MailPackage("Me", "You", expensivePackage);
    Package cheepPackage = new Package("book", 10);
    MailPackage cheepMailPackage = new MailPackage("You", "Me", cheepPackage);
    Package secondExpensivePackage = new Package("gold", 100000);
    MailPackage secondExpensiveMailPackage = new MailPackage("Me", "You", secondExpensivePackage);



    @Test
    public void whenThiefStillContentFromMailPackThenPriceZero() {
        mailPackage = (MailPackage) thief.processMail(mailPackage);
        assertThat(mailPackage.getContent().getContent().contains("stones instead of "), is(true));
        assertThat(mailPackage.getContent().getPrice(), is(0));
    }

    @Test
    public void whenPackageCostIsLowThenThiefDoNosing() {
        cheepMailPackage = (MailPackage) thief.processMail(cheepMailPackage);
        assertThat(cheepMailPackage.getContent().getContent(), is("book"));
        assertThat(cheepMailPackage.getContent().getPrice(), is(10));
    }

    @Test
    public void whenThiefStillContentFromTwoPackageThenGetSum() {
        mailPackage = (MailPackage) thief.processMail(mailPackage);
        secondExpensiveMailPackage = (MailPackage) thief.processMail(secondExpensiveMailPackage);
        assertThat(thief.getStolenValue(), is(220000));
    }
}