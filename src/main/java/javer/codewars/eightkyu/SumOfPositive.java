package javer.codewars.eightkyu;

import static java.util.Arrays.stream;

/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

public class SumOfPositive {

    public static int sum(int[] arr) {
        var result = 0;
        for (var i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }

    public static int sum2(int[] arr) {
        return stream(arr)
                .filter(number -> number > 0)
                .sum();
    }
}
