package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeBinaryTest {

    @Test
    public void testFakeBin() {
        assertEquals("0", FakeBinary.fakeBin("2"));
        assertEquals("0", FakeBinary.fakeBin("4"));
        assertEquals("1", FakeBinary.fakeBin("5"));
        assertEquals("1", FakeBinary.fakeBin("9"));
        assertEquals("00", FakeBinary.fakeBin("24"));
        assertEquals("11", FakeBinary.fakeBin("99"));
    }
}
