package stepik.step2.base24.base248;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialWithRecursionTest {

    FactorialWithRecursion factorialWithRecursion = new FactorialWithRecursion();

    @Test
    public void whenWeTryGetZeroFactorialThanGetOne() {
        assertThat(FactorialWithRecursion.factorial(0), is(BigInteger.valueOf(1)));
    }

    @Test
    public void whenWeTryGetOneFactorialThanGetOne() {
        assertThat(FactorialWithRecursion.factorial(1), is(BigInteger.valueOf(1)));
    }

    @Test
    public void whenWeTryGet13FactorialThanGetTrue() {
        assertThat(FactorialWithRecursion.factorial(13), is(new BigInteger("6227020800")));
    }

}