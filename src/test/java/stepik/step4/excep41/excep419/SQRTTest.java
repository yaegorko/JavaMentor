package stepik.step4.excep41.excep419;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SQRTTest {

    @Test
    public void whenTryGetSqrtFromPositiveNumber() {
        assertThat(SQRT.sqrt(4), is(2d));
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenTryGetSqrtFromNegativeNumberThanGetIllegalArgumentException() {
        assertThat(SQRT.sqrt(-4), is(2d));
    }
}