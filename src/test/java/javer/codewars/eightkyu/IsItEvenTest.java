package javer.codewars.eightkyu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItEvenTest {

    private IsItEven num;

    @Before
    public void setUp() throws Exception {
        num = new IsItEven();
    }

    @After
    public void setDown() throws Exception {
        num = null;
    }

    @Test
    public void testIsEven() {
        assertEquals(true, num.isEven(0));
        assertEquals(false, num.isEven(0.5));
        assertEquals(false, num.isEven(1));
        assertEquals(true, num.isEven(2));
        assertEquals(true, num.isEven(-4));
    }
}
