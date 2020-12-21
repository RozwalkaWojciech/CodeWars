package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbbreviateTwoWordNameTest {

    @Test
    public void testAbbrevName() {
        assertEquals("S.H", AbbreviateTwoWordName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWordName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWordName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWordName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWordName.abbrevName("David Mendieta"));
    }

    @Test
    public void testAbbrevName2() {
        assertEquals("S.H", AbbreviateTwoWordName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWordName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWordName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWordName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWordName.abbrevName("David Mendieta"));
    }
}