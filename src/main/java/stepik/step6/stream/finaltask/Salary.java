package stepik.step6.stream.finaltask;

public class Salary extends SendableTemplate<Integer>  {

    Integer content;

    public Salary(String from, String to, Integer content) {
        super(from, to);
        this.content = content;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
