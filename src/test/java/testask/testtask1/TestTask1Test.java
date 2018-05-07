package testask.testtask1;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TestTask1Test {

    String data = "JavaMentor";
    InputStream stdin = System.in;
    TestTask1 testTask1 = new TestTask1();

    @Test
    public void whenReadStringWithScannerThenCheck() {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertThat(testTask1.readString(), is("JavaMentor"));
    }

    @Test
    public void whenReadStringWithScannerThenDetermineNumberOfCharacters() {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertThat(testTask1.determineNumberOfCharacters(testTask1.readString()), is(10));

    }
    // тут запутался с потоками и как протестировать вывод в консоль.
    // решил просто вывести.
    @Test
    public void ReadStringWithScannerAndDetermineNumberOfCharactersThenPrintResults() {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        testTask1.determineNumberOfCharacters(testTask1.readString());
        testTask1.printResults();

    }
}