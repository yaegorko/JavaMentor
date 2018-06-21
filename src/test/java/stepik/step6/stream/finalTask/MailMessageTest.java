package stepik.step6.stream.finalTask;

import static org.junit.Assert.*;

public class MailMessageTest {

   MailMessage mailMessage1 = new MailMessage(
           "Robert Howard",
           "H.P. Lovecraft",
           "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
   );

    MailMessage secondMessage = new MailMessage(
            "Jonathan Nolan",
            "Christopher Nolan",
            "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
    );

    MailMessage thirdMessage = new MailMessage(
            "Stephen Hawking",
            "Christopher Nolan",
            "Я так и не понял Интерстеллар."
    );


}