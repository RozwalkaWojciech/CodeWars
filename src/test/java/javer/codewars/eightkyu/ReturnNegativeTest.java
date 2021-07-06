package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-45, ReturnNegative.makeNegative2(45));
    }
}