package javer.codewars.sixkyu;

/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
 */

import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {

    public static String high(String s) {

        var wordValue = 0;
        var maxValue = 0;
        var result = "";

        for (String str : s.split(" ")) {
            wordValue = 0;
            for (char ch : str.toCharArray()) {
                wordValue += (ch - 96);
            }
            if (wordValue > maxValue) {
                maxValue = wordValue;
                result = str;
            }
        }
        return result;
    }

    public static String high2(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(w -> w.chars().map(c -> c - 96).sum()))
                .get();
    }

    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
    }
}
