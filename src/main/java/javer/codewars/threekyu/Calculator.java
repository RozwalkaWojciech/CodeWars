package javer.codewars.threekyu;

/*
Create a simple calculator that given a string of operators (), +, -, *, / and numbers separated by spaces returns the value of that expression
Example:
Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed left-to-right.
Additions and subtractions have a lower priority and should also be performed left-to-right.
 */

public class Calculator {

    public static Double evaluate(String expression) {

        for (String str : expression.split(" ")) {
            System.out.println(str.contains("("));
            System.out.println(str);
            Integer integer = Integer.valueOf(str);
            Character character = str.charAt(0);
            System.out.println(integer);
            System.out.println(character);

            int test3 = 2 + character + 3;

            System.out.println(test3);
        }
        int test = 2 / (2 + 3) * 4 - 6;
        System.out.println(test);

        int mathTest = Math.addExact(2, 4);
        System.out.println(mathTest);

        return -1.0;
    }

    public static void main(String[] args) {
        evaluate("2 / ( 2 + 3 ) * 4 - 6");
    }
}
