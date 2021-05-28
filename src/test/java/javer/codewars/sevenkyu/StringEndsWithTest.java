package javer.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringEndsWithTest {
    @Test
    public void testSomething() {
        assertTrue(StringEndsWith.solution("bla", "a"));
        assertTrue(StringEndsWith.solution("enclose", "close"));
        assertFalse(StringEndsWith.solution("end", "endclose"));
    }
}