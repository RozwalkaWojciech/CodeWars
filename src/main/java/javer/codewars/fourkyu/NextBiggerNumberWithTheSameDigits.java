package javer.codewars.fourkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

                rightDigits.add(Character.getNumericValue(strNum.charAt(i)));
                rightDigits.add(Character.getNumericValue(strNum.charAt(i - 1)));

                Collections.sort(rightDigits);

                for (int j = 0; j < rightDigits.size(); j++) {
                    if (rightDigits.get(j) > Character.getNumericValue(strNum.charAt(i - 1))) {
                        sb.append(rightDigits.get(j));
                        rightDigits.remove(rightDigits.get(j));
                        break;
                    }
                }
                for (int digit : rightDigits) {
                    sb.append(digit);
                }
                return Long.parseLong(sb.toString());
            } else {
                rightDigits.add(Character.getNumericValue(strNum.charAt(i)));
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
                    return Long.parseLong(String.valueOf(s));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //expected:<19009> but was:<10909>
        System.out.println(nextBiggerNumber(10990));
        //expected:<154983735> but was:<154983753>
        System.out.println(nextBiggerNumber(154983573));
        //expected:<1234567908> but was:<1234568709>
        System.out.println(nextBiggerNumber(1234567890));
        //expected:<1640951015> but was:<1640955011>
        System.out.println(nextBiggerNumber(1640950511));
        //expected:<598848484 8 3559> but was:<598848484 9 3558>
        System.out.println(nextBiggerNumber(59884848459853L));
    }
}
