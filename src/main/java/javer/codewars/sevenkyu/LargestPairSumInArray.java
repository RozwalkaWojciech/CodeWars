package javer.codewars.sevenkyu;

/*
Given a sequence of numbers, find the largest pair sum in the sequence.

For example
[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
Input sequence contains minimum two elements and every element is an integer.
 */

import java.util.Comparator;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class LargestPairSumInArray {
    public static int largestPairSum(int[] numbers) {
        return stream(numbers)
                .boxed()
                .sorted()
                .collect(toList())
                .subList(numbers.length - 2, numbers.length)
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int largestPairSum2(int[] numbers) {
        return IntStream.of(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int largestPairSum3(int[] numbers) {
        sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
}
