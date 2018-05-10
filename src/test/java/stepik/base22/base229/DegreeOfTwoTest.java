package stepik.base22.base229;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DegreeOfTwoTest {

    @Test
    public void whenTwoIsPowerOfTwoThanTrue() {
        assertThat(DegreeOfTwo.isPowerOfTwo(2), is(true));
    }

    @Test
    public void when64IsPowerOfTwoThanTrue() {
        assertThat(DegreeOfTwo.isPowerOfTwo(64), is(true));
    }

    @Test
    public void when3IsNotPowerOfTwoThanFalse() {
        assertThat(DegreeOfTwo.isPowerOfTwo(3), is(false));
    }

    @Test
    public void whenMinus2IsNotPowerOfTwoThanFalse() {
        assertThat(DegreeOfTwo.isPowerOfTwo(-2), is(true));
    }
}