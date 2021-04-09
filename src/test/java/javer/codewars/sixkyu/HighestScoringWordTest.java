package javer.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestScoringWordTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high2("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high2("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high2("take me to semynak"));
    }
}