package stepik.step6.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FindMinMaxTest {


    @Test
    public <T> void testEmptyStreamCount() {

        BiConsumer<? super T, ? super T> minMaxConsumer = (min, max) -> System.out.print(min + " " + max);
        Comparator<? super T> order = (min, max) -> (Integer) min - (Integer) max;
        FindMinMax.findMinMax(Stream.empty(), order, minMaxConsumer);
    }

    @Test
    public <T> void testStreamCount() {
        BiConsumer<? super T, ? super T> minMaxConsumer = (min, max) -> System.out.print(min + " " + max);
        Comparator<? super T> order = (min, max) -> (Integer) min - (Integer) max;
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 2);
        Stream stream = collection.stream();
        FindMinMax.findMinMax(stream, order, minMaxConsumer);
    }



}