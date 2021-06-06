package javer.codewars.eightkyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveFirstAndLastCharacterTest {
    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveFirstAndLastCharacter.remove("eloquent"));
        assertEquals("ountr", RemoveFirstAndLastCharacter.remove("country"));
        assertEquals("erso", RemoveFirstAndLastCharacter.remove("person"));
        assertEquals("lac", RemoveFirstAndLastCharacter.remove("place"));
    }
}