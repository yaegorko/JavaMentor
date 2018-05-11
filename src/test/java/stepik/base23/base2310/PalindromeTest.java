package stepik.base23.base2310;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void testWhenWeHavePalindromeThanGetTrue() {
        assertThat(Palindrome.isPalindrome("Madam, I'm Adam!"), is(true));
    }
}