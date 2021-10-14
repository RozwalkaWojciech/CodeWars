package javer.codewars.eightkyu;

import java.util.Arrays;

public class SumOfPositive {

    public static int sum(int[] arr) {

        int result = 0;

        for (var i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result += arr[i];
            }
        }
        return result;
    }

    public static int sum2(int[] arr) {
        return Arrays.stream(arr).filter(value -> value > 0).sum();
    }
}
