package stepik.base22.base223;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UnicodeTest {

    @Test
    public void when92Plus32ThenGet124() {
        assertThat(Unicode.charExpression(32), is('|'));
    }
    @Test
    public void when92Plus29ThenGet121() {
        assertThat(Unicode.charExpression(29), is('y'));
    }
}