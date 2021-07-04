package javer.codewars.sevenkyu;

/*
I will give you an integer. Give me back a shape that is as long and wide as the integer. The integer will be a whole number between 1 and 50.

Example
n = 3, so I expect a 3x3 square back just like below as a string:

+++
+++
+++
 */

import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

class BuildSquare {

    public static String generateShape(int n) {
        return "+"
                .repeat(n)
                .concat("\n")
                .repeat(n)
                .trim();
    }

    public static String generateShape2(int n) {
        return IntStream
                .range(0, n)
                .mapToObj(value -> "+".repeat(n))
                .collect(joining("\n"));
    }
}
