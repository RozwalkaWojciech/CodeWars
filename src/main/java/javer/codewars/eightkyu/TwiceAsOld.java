package javer.codewars.eightkyu;

/*
Your function takes two arguments:
current father's age (years)
current age of his son (years)
Calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
 */

import static java.lang.Math.abs;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears) {
        return abs(dadYears - sonYears * 2);
    }

    public static int TwiceAsOld2(int dadYears, int sonYears) {
        var result = dadYears - sonYears * 2;
        return result > 0 ? result : -result;
    }
}
