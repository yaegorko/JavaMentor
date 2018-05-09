package stepik.base21.base217;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    public void whenCheckFirstYear() {
        assertThat(LeapYear.leapYearCount(1), is(0));
    }

    @Test
    public void whenCheckFoursYear() {
        assertThat(LeapYear.leapYearCount(4), is(1));
    }

    @Test
    public void whenCheck100Year() {
        assertThat(LeapYear.leapYearCount(100), is(24));
    }

    @Test
    public void whenCheck400Year() {
        assertThat(LeapYear.leapYearCount(401), is(97));
    }
}