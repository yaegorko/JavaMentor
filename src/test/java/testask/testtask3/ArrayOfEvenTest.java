package testask.testtask3;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayOfEvenTest {

    String data = "-2,-1,0,1,2,3,4";
    ArrayOfEven arrayOfEven = new ArrayOfEven();

    {
        System.setIn(new ByteArrayInputStream(this.data.getBytes()));
        try {
            this.arrayOfEven.readNumbers();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenCreateStringThenCheckArrayLength() throws IOException {

        assertThat(this.arrayOfEven.getArrayOfNumbers().length, is(7));
    }
    //надо спросить как тестить консоль.
    @Test
    public void whenGetEvenFromArrayThenPrintEm() {
        this.arrayOfEven.printEven();
    }
}