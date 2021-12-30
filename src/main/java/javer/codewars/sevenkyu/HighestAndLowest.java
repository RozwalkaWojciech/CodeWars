package javer.codewars.sevenkyu;

/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

Notes:
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

import static java.lang.System.out;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        var min = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .min()
                .getAsInt();
        var max = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
        return String.format("%d %d", max, min);
    }

    public static String HighAndLow2(String numbers) {
        IntSummaryStatistics stat = Stream
                .of(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        return stat.getMax() + " " + stat.getMin();
    }

    public static void main(String[] args) {
        out.println(highAndLow("-1 3 2 -4 5"));
    }
}
