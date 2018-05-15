package stepik.step2.base21.base215;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Base215ShortTest {
    @Test
    public void test0011() {
        assertThat(Base215Short.booleanExpression(false, false, true, true), is(true));
    }

    @Test
    public void test0101() {
        assertThat(Base215Short.booleanExpression(false, true, false, true), is(true));
    }

    @Test
    public void test0110() {
        assertThat(Base215Short.booleanExpression(false, true, true, false), is(true));
    }

    @Test
    public void test1001() {
        assertThat(Base215Short.booleanExpression(true, false, false, true), is(true));
    }

    @Test
    public void test1010() {
        assertThat(Base215Short.booleanExpression(true, false, true, false), is(true));
    }

    @Test
    public void test1100() {
        assertThat(Base215Short.booleanExpression(true, true, false, false), is(true));
    }
    //false tests
    @Test
    public void test0000() {
        assertThat(Base215Short.booleanExpression(false, false, false, false), is(false));
    }

    @Test
    public void test0001() {
        assertThat(Base215Short.booleanExpression(false, false, false, true), is(false));
    }

    @Test
    public void test0010() {
        assertThat(Base215Short.booleanExpression(false, false, true, false), is(false));
    }

    @Test
    public void test0100() {
        assertThat(Base215Short.booleanExpression(false, true, false, false), is(false));
    }

    @Test
    public void test0111() {
        assertThat(Base215Short.booleanExpression(false, true, true, true), is(false));
    }

    @Test
    public void test1000() {
        assertThat(Base215Short.booleanExpression(true, false, false, false), is(false));
    }

    @Test
    public void test1011() {
        assertThat(Base215Short.booleanExpression(true, false, true, true), is(false));
    }

    @Test
    public void test1101() {
        assertThat(Base215Short.booleanExpression(true, true, false, true), is(false));
    }

    @Test
    public void test1110() {
        assertThat(Base215Short.booleanExpression(true, true, true, false), is(false));
    }

    @Test
    public void test1111() {
        assertThat(Base215Short.booleanExpression(true, true, true, true), is(false));
    }
}