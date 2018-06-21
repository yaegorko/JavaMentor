package stepik.step6.stream.finalTask;

public class Salary extends SendableTemplate  {

    Integer salary;

    public Salary(String from, String to, Integer salary) {
        super(from, to);
        this.salary = salary;
    }
}
