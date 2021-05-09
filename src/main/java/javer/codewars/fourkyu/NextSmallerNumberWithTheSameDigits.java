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
            for (int j = digitArr.length - 1; j > i; j--) {
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

    public static void main(String[] args) {

        System.out.println(nextSmaller(1027));
        System.out.println(nextSmaller(907));
        System.out.println(nextSmaller(123456798));
    }
}
