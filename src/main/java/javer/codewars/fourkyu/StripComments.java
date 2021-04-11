package javer.codewars.fourkyu;

/*
Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
Any whitespace at the end of the line should also be stripped out.
Example:

Given an input string of:
apples, pears # and bananas
grapes
bananas !apples

The output expected would be:
apples, pears
grapes
bananas
 */

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        String format = String.format("[ ]*([%s].*)?$", String.join("", commentSymbols));
        return Stream.of(text.split("\n")).map(s -> s.replaceAll(format, "")).collect(Collectors.joining("\n"));
    }
}
