package stepik.step5.io52.io529;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    private Main main = new Main();
    //подменяю входные и выходные потоки.
    public byte[] doTest(byte[] inputBytes) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(inputBytes);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setIn(inputStream);
        System.setOut(printStream);
        main.readSystemIn();
        return outputStream.toByteArray();
    }

    @Test
    public void testInputStream() throws IOException {
        byte[] inputBytes = {65, 13, 10, 10, 13};
        byte[] expectedBytes = {65, 10, 10, 13};
        assertArrayEquals(expectedBytes, doTest(inputBytes));
    }
}