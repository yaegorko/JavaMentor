package stepik.step3.oop35.oop357;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LeftTriangleTest {

    LeftTriangle leftTriangle = new LeftTriangle();

    @Test
    public void sameTest() {
        assertThat(LeftTriangle.integrate(x -> 1, 0, 10) - 10D < 1e-6, is(true));
    }

}