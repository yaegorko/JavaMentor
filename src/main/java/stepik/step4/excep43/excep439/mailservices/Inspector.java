package stepik.step4.excep43.excep439.mailservices;

import stepik.step4.excep43.excep439.packages.MailPackage;
import stepik.step4.excep43.excep439.packages.Package;
import stepik.step4.excep43.excep439.packages.Sendable;

/**
 * 4) Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
 * если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
 * ("weapons" и "banned substance"), то он бросает IllegalPackageException.
 * Если он находит посылку, состоящую из камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException.
 * Оба исключения вы должны объявить самостоятельно в виде непроверяемых исключений.
 */

public class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) {

        Package content = ((MailPackage) mail).getContent();

        if (mail.getClass() == MailPackage.class
                && (WEAPONS.equals(content.getContent()) || (BANNED_SUBSTANCE.equals(content.getContent())))) {
            throw new IllegalPackageException();
        } else if (mail.getClass() == MailPackage.class && (content.getContent().contains("stones"))) {
            throw new StolenPackageException();
        }

        return mail;
    }
}
