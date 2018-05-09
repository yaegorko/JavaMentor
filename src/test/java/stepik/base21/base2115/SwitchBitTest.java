package stepik.base21.base2115;

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
}