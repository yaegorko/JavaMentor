package stepik.step6.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DifferenceTest {

    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2));
    Set<Integer> expectedSet = new HashSet<>(Arrays.asList(0, 3));

    @Test
    public void test1() {
        assertThat(Difference.symmetricDifference(set1, set2), is(expectedSet));
    }

}