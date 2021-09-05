package javer.codewars.sixkyu;

/*Everyone knows passphrases. One can choose passphrases from poems, songs,
movies names and so on but frequently they can be guessed due to common cultural references.
You can get your passphrases stronger by different means. One is the following:

choose a text in capital letters including or not digits and non alphabetic characters,
1.shift each letter by a given number but the transformed letter must be a letter (circular shift),
2.replace each digit by its complement to 9,
3.keep such as non alphabetic and non digit characters,
4.downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
5.reverse the whole result.

Example:
your text: "BORN IN 2015!", shift 1
1 + 2 + 3 -> "CPSO JO 7984!"
4 "CpSo jO 7984!"
5 "!4897 Oj oSpC"
With longer passphrases it's better to have a small and easy program. Would you write it?
*/

import static java.lang.Character.*;
import static java.lang.System.out;

public class PlayingWithPassphrases {

    public static String playPass(String s, int n) {

        var arr = s.toLowerCase().toCharArray();
        var sb = new StringBuilder();

        for (var i = 0; i < arr.length; i++) {
            if (isLetter(arr[i])) {
                if (i % 2 == 0) {
                    if ((arr[i] + n) > 122) {
                        sb.append((char) toUpperCase((97 + (arr[i] - 122) + (n - 1))));
                    } else {
                        sb.append((char) toUpperCase(arr[i] + n));
                    }
                } else {
                    if ((arr[i] + n) > 122) {
                        sb.append((char) toLowerCase((97 + (arr[i] - 122) + (n - 1))));
                    } else {
                        sb.append((char) toLowerCase(arr[i] + n));
                    }
                }
            } else if (isDigit(s.charAt(i))) {
                sb.append((char) (48 + (57 - s.charAt(i))));
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        out.println(playPass("I LOVE YOU Z!!!", 1));
        out.println(playPass("APRIL 2015", 2));
    }
}

/*import java.util.stream.Collectors;

public class PlayPass {
    private static int count = 0;

    public static String playPass(final String s, final int n) {
        count = 0;

        return new StringBuilder()
                .append(
                        s.toUpperCase()
                                .chars()
                                .map(i -> Character.isDigit(i) ? 57 - Character.getNumericValue(i) : i)
                                .mapToObj(c -> (char) c)
                                .map(c -> (c <= 90 && c >= 65) ? (char) (c + (n % 26)) : c)
                                .map(c -> c > 90 ? (char) ((c % 91) + 65) : c)
                                .map(i -> i.toString())
                                .map(i -> (count++ % 2) == 0 ? i.toUpperCase() : i.toLowerCase())
                                .collect(Collectors.joining("")))
                .reverse()
                .toString();
    }
}*/

