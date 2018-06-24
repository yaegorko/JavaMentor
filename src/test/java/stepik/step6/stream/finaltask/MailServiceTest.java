package stepik.step6.stream.finaltask;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MailServiceTest {

    MailMessageTest mailMessageTest = new MailMessageTest();

    MailService<String> mailService = new MailService<>();

    MailService<Integer> salaryService = new MailService<>();

    SalaryTest salaryTest = new SalaryTest();

    List<MailMessage> messages = Arrays.asList(
            mailMessageTest.firstMessage,
            mailMessageTest.secondMessage,
            mailMessageTest.thirdMessage
    );


    {
        messages.stream().forEachOrdered(mailService);
        Map<String, List<String>> mailBox = mailService.getMailBox();
        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ) : "wrong mailService mailbox content (1)";
        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                )
        ) : "wrong mailService mailbox content (2)";
        assert mailBox.get(salaryTest.randomTo).equals(Collections.<String>emptyList()) : "wrong mailService mailbox content (3)";
    }

    {
        Arrays.asList(salaryTest.salary1, salaryTest.salary2, salaryTest.salary3).forEach(salaryService);
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assert salaries.get(salaryTest.salary1.getTo()).equals(Arrays.asList(1)) : "wrong salaries mailbox content (1)";
        assert salaries.get(salaryTest.salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)) : "wrong salaries mailbox content (2)";
        assert salaries.get(salaryTest.randomTo).equals(Arrays.asList(salaryTest.randomSalary)) : "wrong salaries mailbox content (3)";
    }


    @Test
    public void test1() {
        //      List list =  Arrays.asList("This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!");
        mailService.accept(salaryTest.salary1);
    }

}