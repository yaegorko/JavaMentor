package stepik.step4.excep43.excep439.mailservices;

import org.junit.Test;
import stepik.step4.excep43.excep439.packages.MailPackage;
import stepik.step4.excep43.excep439.packages.Package;

import static org.junit.Assert.*;

public class InspectorTest {
    Inspector inspector = new Inspector();
    MailPackage weaponPack = new MailPackage("Me", "You", new Package("weapons", 10000));

    Thief thief = new Thief(100000);
    Package expensivePackage = new Package("gold", 120000);
    MailPackage mailPackage = new MailPackage("Me", "You", expensivePackage);

    @Test (expected = IllegalPackageException.class)
    public void whenMailPackageContainsWeaponThenGetException() {
        inspector.processMail(weaponPack);
    }

}