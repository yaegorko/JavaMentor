package stepik.step6.stream.finaltask;

public class SalaryTest {

    String randomFrom = "Я"; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
    String randomTo = "Ты";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
    int randomSalary = 100;

    Salary salary1;
    Salary salary2;
    Salary salary3;

    public SalaryTest() {

        salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        salary3 = new Salary(randomFrom, randomTo, randomSalary);
    }
}