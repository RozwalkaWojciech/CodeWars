package javer.codewars.fourkyu;

/*
In this kata we want to convert a string into an integer. The strings simply represent the numbers in words.

Examples:

"one" => 1
"twenty" => 20
"two hundred forty-six" => 246
"seven hundred eighty-three thousand nine hundred and nineteen" => 783919
Additional Notes:

The minimum number is "zero" (inclusively)
The maximum number, which must be supported is 1 million (inclusively)
The "and" in e.g. "one hundred and twenty-four" is optional, in some cases it's present and in others it's not
All tested numbers are valid, you don't need to validate them
*/

import java.util.Map;

public class ParseIntReloaded {

    public static int parseInt(String numStr) {

        int result = 0;

        Map<String, Integer> words = Map.ofEntries(
                Map.entry("zero", 0),
                Map.entry("one", 1),
                Map.entry("two", 2),
                Map.entry("three", 3),
                Map.entry("four", 4),
                Map.entry("five", 5),
                Map.entry("six", 6),
                Map.entry("seven", 7),
                Map.entry("eight", 8),
                Map.entry("nine", 9),
                Map.entry("ten", 10),
                Map.entry("eleven", 11),
                Map.entry("twelve", 12),
                Map.entry("thirteen", 13),
                Map.entry("fourteen", 14),
                Map.entry("fifteen", 15),
                Map.entry("sixteen", 16),
                Map.entry("seventeen", 17),
                Map.entry("eighteen", 18),
                Map.entry("nineteen", 19),
                Map.entry("twenty", 20),
                Map.entry("thirty", 30),
                Map.entry("forty", 40),
                Map.entry("fifty", 50),
                Map.entry("sixty", 60),
                Map.entry("seventy", 70),
                Map.entry("eighty", 80),
                Map.entry("ninety", 90));

        Map<String, Integer> mult = Map.of("hundred", 100, "thousand", 1000, "million", 1000000);

        String[] arr = numStr.split(" |-");

        for (String word : arr) {
            if (words.containsKey(word)) {
                result += words.get(word);
            }
            if (mult.containsKey(word)) {
                result *= mult.get(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(parseInt("two hundred forty-six"));
    }
}
