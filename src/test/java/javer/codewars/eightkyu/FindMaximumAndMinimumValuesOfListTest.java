package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaximumAndMinimumValuesOfListTest {
    private FindMaximumAndMinimumValuesOfList find = new FindMaximumAndMinimumValuesOfList();

    @Test
    public void testExamples() {
        assertEquals(-110, find.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, find.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, find.max(new int[]{4, 6, 2, 1, 9, 63, -134, 566}));
        assertEquals(5, find.max(new int[]{5}));
    }
}