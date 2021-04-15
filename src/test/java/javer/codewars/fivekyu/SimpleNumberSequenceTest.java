package javer.codewars.fivekyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleNumberSequenceTest {

    @Test
    public void basicTests() {
        assertEquals(4, SimpleNumberSequence.missing("123567"));
        assertEquals(92, SimpleNumberSequence.missing("899091939495"));
        assertEquals(100, SimpleNumberSequence.missing("9899101102"));
        assertEquals(-1, SimpleNumberSequence.missing("599600601602"));
        assertEquals(-1, SimpleNumberSequence.missing("8990919395"));
        assertEquals(1002, SimpleNumberSequence.missing("998999100010011003"));
        assertEquals(10000, SimpleNumberSequence.missing("99991000110002"));
        assertEquals(-1, SimpleNumberSequence.missing("979899100101102"));
        assertEquals(900003, SimpleNumberSequence.missing("900001900002900004900005900006"));
    }
}