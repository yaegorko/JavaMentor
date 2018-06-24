package stepik.step6.stream.finaltask;

public class Salary<T extends Integer> extends SendableTemplate<T>  {

    // Integer salary;

    public Salary(String from, String to, T content) {
        super(from, to, content);
    }
}
