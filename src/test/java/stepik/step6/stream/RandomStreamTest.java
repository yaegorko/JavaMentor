package stepik.step6.stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RandomStreamTest {

    @Test
    public void test() {
        RandomStream randomStream = new RandomStream();
        RandomStream.pseudoRandomStream(13);
        assertThat(randomStream.testMethod(13), is(16));
        assertThat(randomStream.testMethod(16), is(25));
        assertThat(randomStream.testMethod(25), is(62));
        assertThat(randomStream.testMethod(62), is(384));
        assertThat(randomStream.testMethod(384), is(745));
        assertThat(randomStream.testMethod(745), is(502));
        assertThat(randomStream.testMethod(502), is(200));
        assertThat(randomStream.testMethod(200), is(0));
    }

}