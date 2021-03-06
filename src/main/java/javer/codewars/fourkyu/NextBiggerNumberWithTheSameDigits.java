package javer.codewars.fourkyu;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.getNumericValue;
import static java.lang.Long.parseLong;
import static java.util.Collections.sort;

/*
Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits.
For example:
12 ==> 21
513 ==> 531
2017 ==> 2071
If the digits can't be rearranged to form a bigger number, return -1 (or nil in Swift):
9 ==> -1
111 ==> -1
531 ==> -1
*/
public class NextBiggerNumberWithTheSameDigits {
    public static long nextBiggerNumber(long n) {

        var strNum = String.valueOf(n);
        var sb = new StringBuilder();
        var rightDigits = new ArrayList<Integer>();

        for (int i = strNum.length() - 1; i > 0; i--) {

            if (strNum.charAt(i) > strNum.charAt(i - 1)) {

                sb.append(strNum, 0, i - 1);

                rightDigits.add(getNumericValue(strNum.charAt(i)));
                rightDigits.add(getNumericValue(strNum.charAt(i - 1)));

                sort(rightDigits);

                for (int j = 0; j < rightDigits.size(); j++) {
                    if (rightDigits.get(j) > getNumericValue(strNum.charAt(i - 1))) {
                        sb.append(rightDigits.get(j));
                        rightDigits.remove(rightDigits.get(j));
                        break;
                    }
                }
                for (int digit : rightDigits) {
                    sb.append(digit);
                }
                return parseLong(sb.toString());
            } else {
                rightDigits.add(getNumericValue(strNum.charAt(i)));
            }
        }
        return -1;
    }

    public static long nextBiggerNumber2(long n) {
        char[] s = String.valueOf(n).toCharArray();
        for (int i = s.length - 2; i >= 0; i--) {
            for (int j = s.length - 1; j > i; j--) {
                if (s[i] < s[j]) {
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    Arrays.sort(s, i + 1, s.length);
                    return parseLong(String.valueOf(s));
                }
            }
        }
        return -1;
    }
}
