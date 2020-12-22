package javer.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardMaskTest {

    @Test
    public void testMaskify() {
        assertEquals("############5616", CreditCardMask.maskify("4556364607935616"));
        assertEquals("#######5616", CreditCardMask.maskify("64607935616"));
        assertEquals("1", CreditCardMask.maskify("1"));
        assertEquals("", CreditCardMask.maskify(""));

        // "What was the name of your first pet?"
        assertEquals("##ippy", CreditCardMask.maskify("Skippy"));
        assertEquals("####################################man!", CreditCardMask.maskify("Nananananananananananananananana Batman!"));
    }
}