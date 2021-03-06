package stepik.step4.excep43.excep439.mailservices;

import stepik.step4.excep43.excep439.packages.Sendable;

/**1) UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того,
 *  чтобы передать почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору третьих лиц,
 *  а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService.
 *  У UntrustworthyMailWorker должен быть конструктор от массива MailService
 *  ( результат вызова processMail первого элемента массива передается на вход processMail второго элемента, и т. д.)
 *  и метод getRealMailService, который возвращает ссылку на внутренний экземпляр RealMailService.
 *
 */
public class UntrustworthyMailWorker implements MailService {


    private RealMailService realMailService = new RealMailService();;
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService service : mailServices) {
            mail = service.processMail(mail);
        }

        mail = realMailService.processMail(mail);
        return mail;
    }

}
