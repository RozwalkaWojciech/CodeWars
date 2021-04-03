package javer.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateWordsTest {
    @Test
    public void basicTests() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWords("my cat is my cat fat"));
    }
}