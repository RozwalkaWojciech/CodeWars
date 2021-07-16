package javer.codewars.sevenkyu;

/*
Your task is to remove all duplicate words from a string, leaving only single (first) words entries.

Input:
'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'

Output:
'alpha beta gamma delta'
 */

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String s) {
        return stream(s.split(" "))
                .distinct()
                .collect(joining(" "));
    }
}
