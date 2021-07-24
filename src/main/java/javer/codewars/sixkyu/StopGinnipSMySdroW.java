package javer.codewars.sixkyu;

/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).

Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.
Examples:

spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
spinWords("This is a test") => "This is a test"
spinWords("This is another test") => "This is rehtona test"
 */

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.String.join;

public class StopGinnipSMySdroW {

    public String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 4) {
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }
        return
                join(" ", arr);
    }

    public String spinWords2(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() > 4 ? new StringBuilder(s).reverse().toString() : s)
                .collect(Collectors.joining(" "));
    }
}
