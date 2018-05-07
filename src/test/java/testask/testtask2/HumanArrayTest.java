package testask.testtask2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HumanArrayTest {

    HumanArray humanArray = new HumanArray();

    {
        this.humanArray.createHumanArray();
    }

    Human[] humans = this.humanArray.getHumans();
    @Test
    public void whenCreateArrayThenCheckSameHumanNameAndAge() {

        assertThat(this.humans[5].getName(), is("name5"));
        assertThat(this.humans[5].getAge(), is(5));
        assertThat(this.humans[9].getName(), is("name9"));
        assertThat(this.humans[9].getAge(), is(9));
    }
    //тут тоже не помню как тестить консоль.
    @Test
    public void whenCreateArrayThenAllHumansSayHello() {
        this.humanArray.humanSayHello();
    }
}