package stepik.step6.functionalinterface;

import org.junit.Test;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static stepik.step6.functionalinterface.FunctionalInterface.ternaryOperator;

public class FunctionalInterfaceTest {


    Predicate<Object> condition = Objects::isNull;
    Function<Object, Integer> ifTrue = obj -> 0;
    Function<CharSequence, Integer> ifFalse = CharSequence::length;
    Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

    @Test
    public void whenStringIsNull() {
        assertThat(safeStringLength.apply(null), is(0));
    }

    @Test
    public void whenStringIsNotNull() {
        assertThat(safeStringLength.apply("Dog"), is(3));
    }

}