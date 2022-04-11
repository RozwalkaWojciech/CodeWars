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

import static java.lang.Long.parseLong;
import static java.lang.String.join;
import static java.lang.String.valueOf;
import static java.util.Arrays.sort;
import static java.util.Arrays.stream;
import static java.util.Collections.reverseOrder;
import static java.util.stream.Collectors.joining;

public class NextSmallerNumberWithTheSameDigits {

    public static long nextSmaller(long n) {
        Character[] digitArr = valueOf(n)
                .chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
        for (var i = digitArr.length - 2; i >= 0; i--) {
            for (var j = digitArr.length - 1; j > i; j--) {
                if (digitArr[i] > digitArr[j]) {
                    var character = digitArr[i];
                    digitArr[i] = digitArr[j];
                    digitArr[j] = character;
                    if (digitArr[0] == '0') {
                        return -1;
                    }
                    sort(digitArr, i + 1, digitArr.length, reverseOrder());
                    return parseLong(stream(digitArr)
                            .map(String::valueOf)
                            .collect(joining()));
                }
            }
        }
        return -1;
    }

    public static long nextSmaller2(long n) {
        char[] carr = valueOf(n).toCharArray();
        int len = carr.length, i;
        for (i = len - 1; i > 0; i--) {
            if (carr[i] < carr[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        }
        else {
            int x = carr[i - 1], min = i;
            for (var j = i + 1; j < len; j++) {
                if (carr[j] < x && carr[j] > carr[min]) {
                    min = j;
                }
            }
            char temp = carr[i - 1];
            carr[i - 1] = carr[min];
            carr[min] = temp;
            String[] sarr = valueOf(carr).split("");
            sort(sarr, i, len, reverseOrder());
            long r = parseLong(join("", sarr));
            return valueOf(r).length() == len ? r : -1;
        }
    }
}
