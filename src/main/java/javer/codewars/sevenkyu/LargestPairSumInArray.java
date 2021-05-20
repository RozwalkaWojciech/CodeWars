package javer.codewars.sevenkyu;

/*
Given a sequence of numbers, find the largest pair sum in the sequence.

For example
[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
Input sequence contains minimum two elements and every element is an integer.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestPairSumInArray {
    public static int largestPairSum(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted()
                .collect(Collectors.toList())
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

    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));
    }
}
