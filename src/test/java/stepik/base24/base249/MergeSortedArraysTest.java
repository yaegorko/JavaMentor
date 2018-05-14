package stepik.base24.base249;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MergeSortedArraysTest {

    @Test
    public void whenGetTwoArraysWithEqualLength() {
        assertThat(MergeSortedArrays.mergeArrays(new int[] {0, 1, 2}, new int[] {-1, 3, 5}), is(new int[] {-1, 0, 1, 2, 3, 5}));
    }

    @Test
    public void whenGetTwoArraysFromLesson() {
        assertThat(MergeSortedArrays.mergeArrays(new int[] {0, 2, 2}, new int[] {1, 3}), is(new int[]  {0, 1, 2, 2, 3}));
    }

    @Test
    public void whenSecondArrayLargerThenFirst() {
        assertThat(MergeSortedArrays.mergeArrays(new int[] {0, 2, 2}, new int[] {1, 3, 5, 5}), is(new int[]  {0, 1, 2, 2, 3, 5, 5}));
    }
}