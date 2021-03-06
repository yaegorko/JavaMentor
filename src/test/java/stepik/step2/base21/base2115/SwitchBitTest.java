package stepik.step2.base21.base2115;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchBitTest {

    @Test
    public void whenSwitchFirstBitInTenThenGetEleven() {
        assertThat(SwitchBit.flipBit(10, 1), is(11));
    }

    @Test
    public void whenSwitchFirstBitInZeroThenGetOne() {
       assertThat(SwitchBit.flipBit(0, 1), is(1));
    }

    @Test
    public void whenSwitchFirstBitInOneThenGetZero() {
        assertThat(SwitchBit.flipBit(1, 1), is(0));
    }

    @Test
    public void test() {
        System.out.println(SwitchBit.flipBit(45, 5));
    }
}