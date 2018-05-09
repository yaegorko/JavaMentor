package stepik.base21.base2111;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class APlusBTest {

    @Test
    public void test1() {
        assertThat(APlusB.doubleExpression(0.1d, 0.2d, 0.3d), is(true));
    }

}