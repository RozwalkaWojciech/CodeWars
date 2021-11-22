package javer.codewars.threekyu;

/*
Create a simple calculator that given a string of operators (), +, -, *, / and numbers separated by spaces returns the value of that expression
Example:
Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed left-to-right.
Additions and subtractions have a lower priority and should also be performed left-to-right.
 */

import static java.lang.System.out;

public class Calculator {

    // TODO solve it
    public static Double evaluate(String expression) {

        for (String str : expression.split(" ")) {
            out.println(str.contains("("));
            out.println(str);
            var integer = Integer.valueOf(str);
            var character = str.charAt(0);
            out.println(integer);
            out.println(character);

            var test3 = 2 + character + 3;

            out.println(test3);
        }
        var test = 2 / (2 + 3) * 4 - 6;
        out.println(test);

        var mathTest = Math.addExact(2, 4);
        out.println(mathTest);

        return -1.0;
    }

    public static void main(String[] args) {
        evaluate("2 / ( 2 + 3 ) * 4 - 6");
    }
}
