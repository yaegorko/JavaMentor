package stepik.step6.generics;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PairTest {

    Pair<String, Integer> pair = Pair.of(1, "hello");
    Pair<Integer, String> pair2 = Pair.of(1, "hello");

    @Test
    public void whenCreatePairByMethodOf() {
        assertThat(pair.getFirst(), is(1));
        assertThat(pair.getSecond(), is("hello"));
    }

    @Test
    public void whenCheckEqualsAndHasCodeTwoPairs() {
        assertThat(pair.hashCode() == pair2.hashCode(), is(true));
        assertThat(pair.equals(pair2), is(true));
        assertThat(pair2.equals(pair), is(true));
        assertThat(pair.equals(pair), is(true));
    }

}