package javer.codewars.eightkyu;

import java.util.Arrays;

public class SumArrays {

    public static double sum(double[] numbers) {
        var sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double sum2(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
