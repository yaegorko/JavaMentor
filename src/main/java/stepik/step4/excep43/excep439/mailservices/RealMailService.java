package stepik.step4.excep43.excep439.mailservices;


import stepik.step4.excep43.excep439.packages.Sendable;

public  class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }

