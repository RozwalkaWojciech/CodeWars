package javer.codewars.eightkyu;

/*
Simple challenge - eliminate all bugs from the supplied code so that the code runs and outputs the expected value.
Output should be the length of the longest word, as a number.

There will only be one 'longest' word.
*/

import static java.util.stream.Stream.of;

public class SquashTheBugs {

    public static int findLongest(final String str) {
        var strArr = str.split(" ");
        var longest = 0;
        for (var s : strArr) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        return longest;
    }

    public static int findLongest2(final String str) {
        return of(str.split(" "))
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }
}
