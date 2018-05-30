package stepik.step5.io52.io528;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckSumTest {

    CheckSum checkSum = new CheckSum();
    InputStream inputStream = new ByteArrayInputStream(new byte[] {0x33, 0x45, 0x01});

    @Test
    public void testStream() throws IOException {
        assertThat(CheckSum.checkSumOfStream(inputStream), is(71));
    }

}