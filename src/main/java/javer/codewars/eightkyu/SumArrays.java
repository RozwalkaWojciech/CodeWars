package javer.codewars.eightkyu;

import static java.util.Arrays.stream;

public class SumArrays {

    public static double sum(double[] numbers) {
        var sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double sum2(double[] numbers) {
        return stream(numbers)
                .sum();
    }
}
