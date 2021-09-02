package javer.codewars.sixkyu;

/*
You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.

Examples:
strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2

Concatenate the consecutive strings of strarr by 2, we get:

treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]

Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
The first that came is "folingtrashy" so
longest_consec(strarr, 2) should return "folingtrashy".

In the same way:
longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
n being the length of the string array, if n = 0 or k > n or k <= 0 return "".

Note
consecutive strings : follow one after another without an interruption
 */

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.joining;

public class ConsecutiveStrings {

    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0) {
            return "";
        }
        var longestStr = "";
        var newStr = "";
        var stop = false;

        for (int i = 0; i <= strarr.length; i++) {
            newStr = "";
            for (int j = 0; j < k; j++) {
                if (i + j >= strarr.length) {
                    stop = true;
                    break;
                }
                newStr += strarr[i + j];
            }
            if (stop) {
                break;
            } else if (newStr.length() > longestStr.length()) {
                longestStr = newStr;
            }
        }
        return longestStr;
    }

    public static String longestConsec2(String[] strarr, int k) {
        if (k > strarr.length || k <= 0)
            return "";
        var longestStr = "";
        for (var index = 0; index < strarr.length - k + 1; index++) {
            var sb = new StringBuilder();
            for (var i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }

    public static String longestConsec3(String[] strarr, int k) {
        if (k <= 0) {
            return "";
        }
        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(joining()))
                .max(comparingInt(String::length))
                .orElse("");
    }
}
