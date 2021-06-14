package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FIXMEReplaceAllDotsTest {

    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(FIXMEReplaceAllDots.replaceDots("one.two.three")));
    }
}