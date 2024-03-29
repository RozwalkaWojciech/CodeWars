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

import static java.lang.String.join;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class StopGinnipSMySdroW {

    public String spinWords(String sentence) {
        var stringArr = sentence.split(" ");
        for (var i = 0; i < stringArr.length; i++) {
            if (stringArr[i].length() > 4) {
                stringArr[i] = new StringBuilder(stringArr[i]).reverse().toString();
            }
        }
        return join(" ", stringArr);
    }

    public String spinWords2(String sentence) {
        return stream(sentence.split(" "))
                .map(s -> s.length() > 4 ? new StringBuilder(s).reverse().toString() : s)
                .collect(joining(" "));
    }
}
