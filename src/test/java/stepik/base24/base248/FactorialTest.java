package stepik.base24.base248;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenWeTryGetZeroFactorialThanGetOne() {
        assertThat(Factorial.factorial(0), is(BigInteger.valueOf(1)));
    }

    @Test
    public void whenWeTryGetTwoFactorialThanGetTwo() {
        assertThat(Factorial.factorial(2), is(BigInteger.valueOf(2)));
    }

    @Test
    public void whenWeTryGet13FactorialThanGetTwo() {
        assertThat(Factorial.factorial(13), is(new BigInteger("6227020800")));
    }
}