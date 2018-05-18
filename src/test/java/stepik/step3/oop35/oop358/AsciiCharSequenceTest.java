package stepik.step3.oop35.oop358;

import org.junit.Test;

import static org.junit.Assert.*;

public class AsciiCharSequenceTest {

    @Test
    public void testToString() {
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(new byte[] {'a', 'b', 'c', 'd'});
        System.out.println(asciiCharSequence.toString());
    }

}