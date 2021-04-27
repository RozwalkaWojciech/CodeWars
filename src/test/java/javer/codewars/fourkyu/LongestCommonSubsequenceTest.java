package javer.codewars.fourkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest {
    @Test
    public void fixedTests() {
        assertEquals("", LongestCommonSubsequence.lcs("", ""));
        assertEquals("", LongestCommonSubsequence.lcs("abc", ""));
        assertEquals("", LongestCommonSubsequence.lcs("", "abc"));
        assertEquals("", LongestCommonSubsequence.lcs("a", "b"));
        assertEquals("a", LongestCommonSubsequence.lcs("a", "a"));
        assertEquals("ac", LongestCommonSubsequence.lcs("abc", "ac"));
        assertEquals("abc", LongestCommonSubsequence.lcs("abcdef", "abc"));
        assertEquals("acf", LongestCommonSubsequence.lcs("abcdef", "acf"));
        assertEquals("nottest", LongestCommonSubsequence.lcs("anothertest", "notatest"));
        assertEquals("12356", LongestCommonSubsequence.lcs("132535365", "123456789"));
        assertEquals("final", LongestCommonSubsequence.lcs("nothardlythefinaltest", "zzzfinallyzzz"));
        assertEquals("acdefghijklmnoq", LongestCommonSubsequence.lcs("abcdefghijklmnopq", "apcdefghijklmnobq"));
    }
}