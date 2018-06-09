package stepik.step5.io53.io5312;

import org.junit.Test;

import java.io.*;

import static java.nio.charset.StandardCharsets.US_ASCII;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ByteToStringTest {

    ByteToString byteToString = new ByteToString();
    InputStream inputStream = new ByteArrayInputStream(new byte[] {48, 49, 50, 51});

    @Test
    public void test1() throws IOException {
        assertThat(ByteToString.readAsString(inputStream, US_ASCII), is("0123"));
    }

}