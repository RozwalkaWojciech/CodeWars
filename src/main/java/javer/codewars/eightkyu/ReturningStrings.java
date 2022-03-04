package javer.codewars.eightkyu;

/*
Make a function that will return a greeting statement that uses an input;
your program should return, "Hello, <name> how are you doing today?".
 */

import static java.lang.String.format;

public class ReturningStrings {

    public static String greet(String name) {
        return format("Hello, %s how are you doing today?", name);
    }
}
