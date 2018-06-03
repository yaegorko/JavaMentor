package stepik.step5.io53.io5313;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainTest {

    Main main = new Main();

    @Test
    public void whenHaveSimpleNumbers() throws IOException {
        String string = "1 2 3";
        System.setIn(new ByteArrayInputStream(string.getBytes()));
        assertThat(main.sum(), is(6d));
    }

    @Test
    public void whenHaveSymbolsInString() throws IOException {
        String string = "-1e3 \r\n 18 .111 11bbb";
        System.setIn(new ByteArrayInputStream(string.getBytes()));
        assertThat(main.sum(), is(-981.889));
    }

}