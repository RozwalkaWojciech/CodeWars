package javer.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateStringRotationTest {

    @Test
    public void testShiftedDiff() {
        assertEquals(0, CalculateStringRotation.shiftedDiff("lop", "lop"));
        assertEquals(2, CalculateStringRotation.shiftedDiff("coffee", "eecoff"));
        assertEquals(-1, CalculateStringRotation.shiftedDiff("hoop", "pooh"));
        assertEquals(4, CalculateStringRotation.shiftedDiff("eecoff", "coffee"));
    }
}