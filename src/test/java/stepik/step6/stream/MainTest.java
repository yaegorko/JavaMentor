package stepik.step6.stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    Main main = new Main();

    @Test
    public void testStringToStream() {
        String string = "Мама мыла-мыла-мыла раму!";
        main.parseString(string);
    }



}