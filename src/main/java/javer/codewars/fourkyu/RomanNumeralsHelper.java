package javer.codewars.fourkyu;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/*
Create a RomanNumerals class that can convert a roman numeral to and from an integer value.
It should follow the API demonstrated in the examples below.
Multiple roman numeral values will be tested for each helper method.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero.
In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
1666 uses each Roman symbol in descending order: MDCLXVI.

Examples
RomanNumerals.toRoman(1000) // should return 'M'
RomanNumerals.fromRoman("M") // should return 1000

Help
Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
 */
public class RomanNumeralsHelper {

    private static final Map<Integer, String> MAP = new TreeMap<>();

    static {
        MAP.put(1000, "M");
        MAP.put(900, "CM");
        MAP.put(500, "D");
        MAP.put(400, "CD");
        MAP.put(100, "C");
        MAP.put(90, "XC");
        MAP.put(50, "L");
        MAP.put(40, "XL");
        MAP.put(10, "X");
        MAP.put(9, "IX");
        MAP.put(5, "V");
        MAP.put(4, "IV");
        MAP.put(1, "I");
    }

    public static String toRoman(int n) {
        var sb = new StringBuilder();
        while (n != 0) {
            var highestNumb = 0;
            for (Map.Entry<Integer, String> current : MAP.entrySet()) {
                if (current.getKey() <= n) {
                    highestNumb = current.getKey();
                }
            }
            sb.append(MAP.get(highestNumb));
            n -= highestNumb;
        }
        return sb.toString();
    }

    public static int fromRoman(String romanNumeral) {

        Map<Integer, String> reverseMap = new TreeMap<>(Collections.reverseOrder());
        reverseMap.putAll(MAP);
        var result = 0;

        while (!romanNumeral.isEmpty()) {
            for (Map.Entry<Integer, String> current : reverseMap.entrySet()) {
                if (romanNumeral.startsWith(current.getValue())) {
                    romanNumeral = romanNumeral.substring(current.getValue().length(), romanNumeral.length());
                    result += current.getKey();
                }
            }
        }
        return result;
    }
}
