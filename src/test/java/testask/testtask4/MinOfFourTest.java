package testask.testtask4;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinOfFourTest {

    MinOfFour min = new MinOfFour();

    @Test
    public void whenGetFourNumberFindMinOfThemThenCheck() {
        assertThat(min.minOfFour(-1, 0, 3, -6), is(-6));
        assertThat(min.minOfFour(0, 0, 3, 6), is(0));
    }
}