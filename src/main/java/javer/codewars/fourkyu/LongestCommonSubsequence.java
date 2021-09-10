package javer.codewars.fourkyu;

/*
from Wikipedia:
The longest common subsequence (LCS) problem is the problem of finding the longest subsequence common to all sequences in a set of sequences.
It differs from problems of finding common substrings: unlike substrings, subsequences are not required to occupy consecutive positions within the original sequences.

Task
Write a function lcs that accepts two strings and returns their longest common subsequence as a string. Performance matters.

Examples
lcs( "abcdef", "abc" ) => "abc"
lcs( "abcdef", "acf" ) => "acf"
lcs( "132535365", "123456789" ) => "12356"
lcs( "abcdefghijklmnopq", "apcdefghijklmnobq" ) => "acdefghijklmnoq"
Testing
This is a performance version of xDranik's kata of the same name.
This kata, however, has much more full and heavy testing. Intermediate random tests have string arguments of 20 characters; hard random tests 40 characters; extreme 60 characters (characters are chosen out of 36 different ones).

Notes
The subsequences of "abc" are "", "a", "b", "c", "ab", "ac", "bc", "abc".
"" is a valid subsequence in this kata, and a possible return value.
All inputs will be valid.
Two strings may have more than one longest common subsequence. When this occurs, return any of them.

lcs( string0, string1 ) === lcs( string1, string0 )
 */

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

    static String lcs(String a, String b) {

        List<String> subsequenceList = new ArrayList<>();
        var count = a.length();

        while (count != 0) {
            var subsequence = "";
            var jump = 0;
            outLoop:
            for (var i = (a.length() - count); i < a.length(); i++) {
                for (var j = 0 + jump; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        subsequence += a.charAt(i);
                        jump = j + 1;
                        continue outLoop;
                    }
                }
            }
            subsequenceList.add(subsequence);
            count--;
        }
        return "";
    }

    static String lcs2(String a, String b) {
        var result = "";
        var jump = 0;
        outLoop:
        for (var charB : b.toCharArray()) {
            for (var i = 0 + jump; i < a.toCharArray().length; i++) {
                if (charB == a.charAt(i)) {
                    result += charB;
                    jump = i + 1;
                    continue outLoop;
                }
            }
        }
        return result;
    }

    static String lcs3(String a, String b) {
        String result = "";
        String temp = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    temp += a.charAt(i);
                }
            }
            if (temp.length() > result.length()) {
                result = temp;
                temp = "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lcs("anothertest", "notatest"));
        System.out.println(lcs("abcdefghijklmnopq", "apcdefghijklmnobq"));
        System.out.println(lcs("nothardlythefinaltest", "zzzfinallyzzz"));
    }
}
