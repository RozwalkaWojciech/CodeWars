package javer.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPairSumInArrayTest {
    @Test
    public void basicTestCases() {
        assertEquals("Failed test case [10, 14, 2, 23, 19]:", 42, LargestPairSumInArray.largestPairSum(new int[]{10, 14, 2, 23, 19}));
        assertEquals("Failed test case [-100, -29, -24, -19, 19]:", 0, LargestPairSumInArray.largestPairSum(new int[]{-100, -29, -24, -19, 19}));
        assertEquals("Failed test case [1, 2, 3, 4, 6, -1, 2]:", 10, LargestPairSumInArray.largestPairSum(new int[]{1, 2, 3, 4, 6, -1, 2}));
        assertEquals("Failed test case [-10, -8, -16, -18, -19]:", -18, LargestPairSumInArray.largestPairSum(new int[]{-10, -8, -16, -18, -19}));
    }
}