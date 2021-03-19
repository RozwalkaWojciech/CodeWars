package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertStringToAnArrayTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertStringToAnArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertStringToAnArray.stringToArray("I love arrays they are my favorite"));
    }
}