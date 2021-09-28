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
import java.util.stream.Collectors;

public class NextSmallerNumberWithTheSameDigits {

    public static long nextSmaller(long n) {

        Character[] digitArr = String.valueOf(n)
                .chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        for (int i = digitArr.length - 2; i >= 0; i--) {
            for (var j = digitArr.length - 1; j > i; j--) {
                if (digitArr[i] > digitArr[j]) {
                    char tmp = digitArr[i];
                    digitArr[i] = digitArr[j];
                    digitArr[j] = tmp;
                    if (digitArr[0] == '0') {
                        return -1;
                    }
                    Arrays.sort(digitArr, i + 1, digitArr.length, Collections.reverseOrder());
                    return Long.parseLong(Arrays.stream(digitArr).map(String::valueOf).collect(Collectors.joining()));
                }
            }
        }
        return -1;
    }

    public static long nextSmaller2(long n) {
        char[] carr = String.valueOf(n).toCharArray();
        int len = carr.length, i;
        for (i = len - 1; i > 0; i--) {
            if (carr[i] < carr[i - 1]) break;
        }
        if (i == 0) return -1;
        else {
            int x = carr[i - 1], min = i;
            for (int j = i + 1; j < len; j++) {
                if (carr[j] < x && carr[j] > carr[min]) {
                    min = j;
                }
            }
            char temp = carr[i - 1];
            carr[i - 1] = carr[min];
            carr[min] = temp;
            String[] sarr = String.valueOf(carr).split("");
            java.util.Arrays.sort(sarr, i, len, java.util.Collections.reverseOrder());
            long r = Long.parseLong(String.join("", sarr));
            return String.valueOf(r).length() == len ? r : -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(nextSmaller(1027));
        System.out.println(nextSmaller(907));
        System.out.println(nextSmaller(123456798));
    }
}
