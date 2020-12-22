package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MultiplyTest {

    @Test
    public void testMultiply() {
        assertEquals(10.0, Multiply.multiply(2.0, 5.0));
        assertEquals(5, Multiply.multiply(2.0, 2.5));
        assertEquals(0, Multiply.multiply(2.0, 0.0));
        assertNotEquals(10.0, Multiply.multiply(1.0, 5.0));
        assertNotEquals(10, Multiply.multiply(0.0, 5.0));
        assertNotEquals(0, Multiply.multiply(0.1, 0.1));
    }
}