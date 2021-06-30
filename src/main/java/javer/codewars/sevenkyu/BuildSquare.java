package javer.codewars.sevenkyu;

/*
I will give you an integer. Give me back a shape that is as long and wide as the integer. The integer will be a whole number between 1 and 50.

Example
n = 3, so I expect a 3x3 square back just like below as a string:

+++
+++
+++
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuildSquare {

    public static final String generateShape(int n) {
        return "+".repeat(n).concat("\n").repeat(n).trim();
    }

    public static final String generateShape2(int n) {
        return IntStream
                .range(0, n)
                .mapToObj(value -> "+".repeat(n))
                .collect(Collectors.joining("\n"));
    }
}
