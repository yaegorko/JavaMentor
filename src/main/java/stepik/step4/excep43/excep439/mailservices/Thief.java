package stepik.step4.excep43.excep439.mailservices;

import stepik.step4.excep43.excep439.packages.MailPackage;
import stepik.step4.excep43.excep439.packages.Package;
import stepik.step4.excep43.excep439.packages.Sendable;

/**
 * Thief – вор, который ворует самые ценные посылки и игнорирует все остальное.
 * Вор принимает в конструкторе переменную int – минимальную стоимость посылки, которую он будет воровать.
 * Также, в данном классе должен присутствовать метод getStolenValue,
 * который возвращает суммарную стоимость всех посылок, которые он своровал.
 * Воровство происходит следующим образом: вместо посылки, которая пришла вору,
 * он отдает новую, такую же, только с нулевой ценностью и содержимым посылки "stones instead of {content}".
 */

public class Thief implements MailService {

    private int packPrice;
    private int valueOfTheStolenGoods = 0;

    public Thief(int packPrice) {
        this.packPrice = packPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        if (mail.getClass() == MailPackage.class && ((MailPackage) mail).getContent().getPrice() >= packPrice) {
            getStolenValue(((MailPackage) mail).getContent().getPrice());
            mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0));
        }
        return mail;
    }

    public int getStolenValue(int value) {
        valueOfTheStolenGoods += value;
        return valueOfTheStolenGoods;
    }
}
