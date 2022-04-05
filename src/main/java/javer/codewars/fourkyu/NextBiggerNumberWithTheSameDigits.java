package javer.codewars.fourkyu;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.getNumericValue;
import static java.lang.Long.parseLong;
import static java.lang.String.*;
import static java.util.Arrays.*;
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
        var strNum = valueOf(n);
        var sb = new StringBuilder();
        var rightDigits = new ArrayList<Integer>();

        for (var i = strNum.length() - 1; i > 0; i--) {
            if (strNum.charAt(i) > strNum.charAt(i - 1)) {
                sb.append(strNum, 0, i - 1);

                rightDigits.add(getNumericValue(strNum.charAt(i)));
                rightDigits.add(getNumericValue(strNum.charAt(i - 1)));

                sort(rightDigits);

                for (var j = 0; j < rightDigits.size(); j++) {
                    if (rightDigits.get(j) > getNumericValue(strNum.charAt(i - 1))) {
                        sb.append(rightDigits.get(j));
                        rightDigits.remove(rightDigits.get(j));
                        break;
                    }
                }
                for (var digit : rightDigits) {
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
        var charArray = valueOf(n).toCharArray();
        for (var i = charArray.length - 2; i >= 0; i--) {
            for (var j = charArray.length - 1; j > i; j--) {
                if (charArray[i] < charArray[j]) {
                    var charTmp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = charTmp;
                    Arrays.sort(charArray, i + 1, charArray.length);
                    return parseLong(valueOf(charArray));
                }
            }
        }
        return -1;
    }
}
