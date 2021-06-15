package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FIXMEReplaceAllDotsTest {

    @Test
    public void testSomeDots() {
        assertEquals("Sorry, try again :-(", "one-two-three", FIXMEReplaceAllDots.replaceDots("one.two.three"));
    }
}