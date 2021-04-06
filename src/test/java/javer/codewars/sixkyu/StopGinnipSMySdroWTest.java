package javer.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopGinnipSMySdroWTest {
    @Test
    public void test() {
        assertEquals("emocleW", new StopGinnipSMySdroW().spinWords2("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopGinnipSMySdroW().spinWords2("Hey fellow warriors"));
    }
}