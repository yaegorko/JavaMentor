package stepik.step6.collections;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainTest {

    Main main = new Main();
    String data = "1 2 3 4 5 6 7";
    InputStream inputStream = new ByteArrayInputStream(data.getBytes());


    @Test
    public void test() throws IOException {
        System.setIn(inputStream);
        main.method();
    }

}