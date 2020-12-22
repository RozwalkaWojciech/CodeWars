package javer.codewars.eightkyu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsItEvenTest {

    private IsItEven num;

    @Before
    public void setUp() {
        num = new IsItEven();
    }

    @After
    public void setDown() {
        num = null;
    }

    @Test
    public void testIsEven() {
        assertTrue(num.isEven(0));
        assertFalse(num.isEven(0.5));
        assertFalse(num.isEven(1));
        assertTrue(num.isEven(2));
        assertTrue(num.isEven(-4));
    }
}
