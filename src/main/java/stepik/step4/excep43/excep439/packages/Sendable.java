package stepik.step4.excep43.excep439.packages;

        /*
        Интерфейс: сущность, которую можно отправить по почте.
        У такой сущности можно получить от кого и кому направляется письмо.
        */
public interface Sendable {
    String getFrom();
    String getTo();
}