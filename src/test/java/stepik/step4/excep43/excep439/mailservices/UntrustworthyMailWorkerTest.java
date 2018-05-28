package stepik.step4.excep43.excep439.mailservices;

import org.junit.Test;
import stepik.step4.excep43.excep439.packages.MailPackage;
import stepik.step4.excep43.excep439.packages.Package;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UntrustworthyMailWorkerTest {

    Thief thief = new Thief(1000);
    Inspector inspector = new Inspector();
    UntrustworthyMailWorker worker = new UntrustworthyMailWorker(new MailService[] {thief, inspector});

    Package expensivePackage = new Package("gold", 120000);
    MailPackage mailPackage = new MailPackage("Me", "You", expensivePackage);

    Package explosivePackage = new Package("weapons", 500);
    MailPackage explosiveMailPackage = new MailPackage("Me", "You", explosivePackage);

    @Test (expected = StolenPackageException.class)
    public void testThiefAndInspector() {
        worker.processMail(mailPackage);
        assertThat(expensivePackage.getPrice(), is(0));
    }

    @Test (expected = IllegalPackageException.class)
    public void testWeaponPack() {
        worker.processMail(explosiveMailPackage);
    }
}
