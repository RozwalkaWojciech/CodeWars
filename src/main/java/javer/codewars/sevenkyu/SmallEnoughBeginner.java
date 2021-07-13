package javer.codewars.sevenkyu;

/*
You will be given an array and a limit value. You must check that all values
in the array are below or equal to the limit value. If they are, return true. Else, return false.

You can assume all values in the array are numbers.
 */

import static java.util.Arrays.sort;
import static java.util.Arrays.stream;

public class SmallEnoughBeginner {

    public static boolean smallEnough(int[] a, int limit) {
        sort(a);
        return a[a.length - 1] <= limit;
    }

    public static boolean smallEnough2(int[] a, int limit) {
        return stream(a).noneMatch(i -> i > limit);
    }
}
