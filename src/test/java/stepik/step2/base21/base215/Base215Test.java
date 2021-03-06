package stepik.step2.base21.base215;

import org.junit.Test;
import stepik.step2.base21.base215.Base215;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Base215Test {
    Base215 base215 = new Base215();
    @Test
    public void test1() {
        assertThat(Base215.booleanExpression(false, false, false, false), is(false));
    }

    @Test
    public void test2() {
        assertThat(Base215.booleanExpression(true, true, true, true), is(false));
    }

    @Test
    public void test3() {
        assertThat(Base215.booleanExpression(false, false, true, true), is(true));
    }
}