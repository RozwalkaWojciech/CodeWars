package javer.codewars.sevenkyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Task:
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"
 */
public class OddOrEven {

    public static String oddOrEven(int[] array) {
        return (Arrays.stream(array).sum()) % 2 == 0 ? "even" : "odd";
    }

    public static String oddOrEven2(int[] array) {
        return (IntStream.of(array).sum() & 1) == 1 ? "odd" : "even";
    }

    public static String oddOrEven3(int[] array) {
        var xor = 0;
        for (int i : array) {
            xor ^= i;
        }
        return (xor & 1) == 1 ? "odd" : "even";
    }
}
