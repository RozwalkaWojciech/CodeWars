package javer.codewars.fourkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextBiggerNumberWithTheSameDigitsTest {
    @Test
    public void basicTests() {
        assertEquals(21, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(414));
        assertEquals(414, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(144));
        assertEquals(19009, NextBiggerNumberWithTheSameDigits.nextBiggerNumber(10990));
    }
}