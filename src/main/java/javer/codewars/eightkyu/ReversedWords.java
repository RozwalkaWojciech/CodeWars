package javer.codewars.eightkyu;

/*
Complete the solution so that it reverses all of the words within the string passed in.
Example:
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */

import static java.lang.String.join;
import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.Collections.reverse;

public class ReversedWords {

    public static String reverseWords(String str) {
        return stream(str.split(" ")).reduce(((s1, s2) -> s2 + " " + s1)).get();
    }

    public static String reverseWords2(String str) {
        var list = asList(str.split(" "));
        reverse(list);
        return join(" ", list);
    }
}