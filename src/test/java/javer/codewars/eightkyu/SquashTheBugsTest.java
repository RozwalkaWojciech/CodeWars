package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquashTheBugsTest {

    @Test
    public void findLongest() {
        // assertEquals("expected", "actual");
        assertEquals(7, SquashTheBugs.findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, SquashTheBugs.findLongest("Take me to tinseltown with you"));
        assertEquals(7, SquashTheBugs.findLongest("Sausage chops"));
        assertEquals(6, SquashTheBugs.findLongest("Wind your body and wiggle your belly"));
        assertEquals(7, SquashTheBugs.findLongest("Lets all go on holiday"));
    }

    @Test
    public void findLongest2() {
        // assertEquals("expected", "actual");
        assertEquals(7, SquashTheBugs.findLongest2("The quick white fox jumped around the massive dog"));
        assertEquals(10, SquashTheBugs.findLongest2("Take me to tinseltown with you"));
        assertEquals(7, SquashTheBugs.findLongest2("Sausage chops"));
        assertEquals(6, SquashTheBugs.findLongest2("Wind your body and wiggle your belly"));
        assertEquals(7, SquashTheBugs.findLongest2("Lets all go on holiday"));
    }
}
