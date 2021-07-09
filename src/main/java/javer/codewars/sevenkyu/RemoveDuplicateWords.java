package javer.codewars.sevenkyu;

/*
Your task is to remove all duplicate words from a string, leaving only single (first) words entries.

Input:
'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'

Output:
'alpha beta gamma delta'
 */

import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String s) {
        return stream(s.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}
