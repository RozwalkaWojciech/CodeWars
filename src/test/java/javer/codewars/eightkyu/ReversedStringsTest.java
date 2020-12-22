package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedStringsTest {

    @Test
    public void testSolution() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
    }
}