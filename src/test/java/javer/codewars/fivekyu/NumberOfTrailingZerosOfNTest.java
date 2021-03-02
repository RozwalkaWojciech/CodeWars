package javer.codewars.fivekyu;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberOfTrailingZerosOfNTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(NumberOfTrailingZerosOfN.zeros(0), is(0));
        assertThat(NumberOfTrailingZerosOfN.zeros(6), is(1));
        assertThat(NumberOfTrailingZerosOfN.zeros(14), is(2));
    }
}