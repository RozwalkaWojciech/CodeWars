package javer.codewars.eightkyu;

/*
Simple challenge - eliminate all bugs from the supplied code so that the code runs and outputs the expected value.
Output should be the length of the longest word, as a number.

There will only be one 'longest' word.
*/

public class SquashTheBugs {
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (String s : spl) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        return longest;
    }
}
