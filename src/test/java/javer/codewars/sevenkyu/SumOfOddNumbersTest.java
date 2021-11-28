package javer.codewars.sevenkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42));
    }
}
