package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturningStringsTest {

    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }
}