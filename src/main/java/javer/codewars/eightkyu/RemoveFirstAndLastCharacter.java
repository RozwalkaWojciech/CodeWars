package javer.codewars.eightkyu;

/*
It's pretty straightforward.
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.
 */

public class RemoveFirstAndLastCharacter {

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String remove2(String str) {
        return str.replaceAll("^.|.$", "");
    }

    public static String remove3(String str) {
        return new StringBuilder(str).deleteCharAt(0).deleteCharAt(str.length() - 1).toString();
    }
}
