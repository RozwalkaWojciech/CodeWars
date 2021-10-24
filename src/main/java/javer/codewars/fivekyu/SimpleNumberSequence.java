package javer.codewars.fivekyu;

/*
In this Kata, you will be given a string of numbers in sequence and your task will be to return the missing number.
If there is no number missing or there is an error in the sequence, return -1.

For example:
missing("123567") = 4
missing("899091939495") = 92
missing("9899101102") = 100
missing("599600601602") = -1 -- no number missing
missing("8990919395") = -1 -- error in sequence. Both 92 and 94 missing.
The sequence will always be in ascending order.
 */

import static java.lang.System.out;

public class SimpleNumberSequence {

    public static int missing(String s) {
        var result = 0;
        for (var i = 1; i < Math.min(8, s.length() / 2); i++) {
            var temp = 1;
            int m = Integer.parseInt(s.substring(0, i));
            int hold = i;
            while (hold < s.length()) {
                m++;
                var n = String.valueOf(m);
                if (!n.equals(s.substring(hold, hold + n.length()))) {
                    result = m;
                    temp--;
                    if (temp < 0) break;
                } else hold += n.length();
            }
            if (temp == 0 && hold == s.length()) return result;
        }
        return -1;
    }

    public static void main(String[] args) {
        out.println(missing("899091939495"));
        out.println(missing("900001900002900004900005900006"));
    }
}
