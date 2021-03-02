package javer.codewars.fivekyu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {
    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertTrue(ValidParentheses.validParentheses("()"));
        assertFalse(ValidParentheses.validParentheses("())"));
        assertFalse(ValidParentheses.validParentheses("32423(sgsdg)"));
        assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
        assertTrue(ValidParentheses.validParentheses("adasdasfa"));
    }
}
