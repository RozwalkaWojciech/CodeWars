package javer.codewars.fourkyu;

/*
Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.

For example:
nextSmaller(21) == 12
nextSmaller(531) == 513
nextSmaller(2071) == 2017
Return -1 (for Haskell: return Nothing, for Rust: return None), when there is no smaller number that contains the same digits. Also return -1 when the next smaller number with the same digits would require the leading digit to be zero.

nextSmaller(9) == -1
nextSmaller(111) == -1
nextSmaller(135) == -1
nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
some tests will include very large numbers.
test data only employs positive integers.
The function you write for this challenge is the inverse of this kata: "Next bigger number with the same digits."
 */

import java.util.Arrays;
import java.util.Collections;

public class NextSmallerNumberWithTheSameDigits {

    public static long nextSmaller(long n) {

        char[] s = String.valueOf(n).toCharArray();
        Character[] digitArr = new Character[s.length];

        for (int i = s.length - 2; i >= 0; i--) {
            for (int j = s.length - 1; j > i; j--) {
                if (s[i] > s[j]) {
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    if (s[0] == '0') {
                        return -1;
                    }
                    for (int k = 0; k < s.length; k++) {
                        digitArr[k] = s[k];
                    }
                    Arrays.sort(digitArr, i + 1, digitArr.length, Collections.reverseOrder());
                    StringBuilder result = new StringBuilder();
                    for (char c : digitArr) {
                        result.append(c);
                    }
                    return Long.parseLong(result.toString());
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(nextSmaller(1027));
        System.out.println(nextSmaller(907));
        System.out.println(nextSmaller(123456798));
    }
}
