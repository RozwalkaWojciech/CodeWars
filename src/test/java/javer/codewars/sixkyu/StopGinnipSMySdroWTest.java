package javer.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopGinnipSMySdroWTest {
    @Test
    public void test() {
        assertEquals("emocleW", new StopGinnipSMySdroW().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopGinnipSMySdroW().spinWords("Hey fellow warriors"));
    }
}