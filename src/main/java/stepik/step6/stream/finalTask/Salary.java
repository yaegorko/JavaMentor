package stepik.step6.stream.finalTask;

import java.util.Objects;

public class Salary<T extends Integer> extends SendableTemplate<T>  {

    // Integer salary;

    public Salary(String from, String to, T content) {
        super(from, to, content);
    }
}
