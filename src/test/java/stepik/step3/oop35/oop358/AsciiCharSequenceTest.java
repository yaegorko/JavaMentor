package stepik.step3.oop35.oop358;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AsciiCharSequenceTest {
    AsciiCharSequence asciiCharSequence = new AsciiCharSequence(new byte[] {'a', 'b', 'c', 'd'});
    @Test
    public void testAsciiCharSequenceToString() {
       assertThat(asciiCharSequence.toString(), is("abcd"));
    }

    @Test
    public void whenTestAsciiCharSequenceLength() {
        assertThat(asciiCharSequence.length(), is(4));
    }

    @Test
    public void whenTestPositionInAsciiCharSequence() {
        assertThat(asciiCharSequence.charAt(0), is('a'));
        assertThat(asciiCharSequence.charAt(3), is('d'));
    }

//    @Test
//    public void whrnGerSubSequenceFromAsciiCharSequence() {
//        assertThat(asciiCharSequence.subSequence(1, 3), is(new AsciiCharSequence(new byte[] {'b', 'c'})));
//    }

}