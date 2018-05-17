package stepik.step3.oop34.oop349;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ComplexNumberTest {

    ComplexNumber first = new ComplexNumber(5, 10);
    ComplexNumber second = new ComplexNumber(5, 10);
    ComplexNumber third = new ComplexNumber(5, 10);

    @Test
    public void whenComplexNumberEqualsToHimSelf() {
        assertThat(first.equals(first), is(true));
        assertThat(second.equals(second), is(true));
    }

    @Test
    public void whenFirstEqualsSecondThanTrue() {
        assertThat(first.equals(second), is(true));
        assertThat(second.equals(first), is(true));
    }

    @Test
    public void whenFirstEqualsThirdAndSecondEqualsThirdThanFirstEqualsSecondIsTrue() {
        assertThat(first.equals(third), is(true));
        assertThat(second.equals(third), is(true));
        assertThat(first.equals(second), is(true));
    }

    @Test
    public void whenFirstEqualsSecondThanTheirHashcodeIsEquals() {
        assertThat(first.equals(second), is(true));
        assertThat(second.equals(first), is(true));
        assertThat(first.hashCode() == second.hashCode(), is(true));
    }

    @Test
    public void test() {
        ComplexNumber fours = new ComplexNumber(10, 5);
        assertThat(first.hashCode() == fours.hashCode(), is(false));
    }

}